package com.ranzn.cleanarchit.app.persentation

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.GridLayoutManager
import com.ranzn.cleanarchit.R
import com.ranzn.cleanarchit.app.persentation.adapter.MainRecyclerViewAdapter
import com.ranzn.cleanarchit.app.persentation.listners.OnItemClick
import com.ranzn.cleanarchit.common.NetworkResult
import com.ranzn.cleanarchit.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() , OnItemClick{

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()

    private lateinit var mainRecyclerViewAdapter: MainRecyclerViewAdapter
    private lateinit var mainRecyclerViewAdapter2: MainRecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setRecyclerView()

        viewModel.data.observe(this, Observer { result ->
            when (result) {
                is NetworkResult.Success -> {
                    binding.progressBar.visibility = View.GONE
                    mainRecyclerViewAdapter.submitList(result.data?.results)
                }
                is NetworkResult.Loading -> {
                    binding.progressBar.visibility = View.VISIBLE
                }
                is NetworkResult.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, result.message.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        })
        viewModel.data2.observe(this, Observer {
            mainRecyclerViewAdapter2.submitList(it?.results)
        })

    }
    private fun setRecyclerView() {
        mainRecyclerViewAdapter = MainRecyclerViewAdapter(this)
        mainRecyclerViewAdapter2 = MainRecyclerViewAdapter(this)

        val concatAdapterConfig = ConcatAdapter.Config.Builder()
            .setIsolateViewTypes(false)
            .build()

        val concatAdapter = ConcatAdapter(concatAdapterConfig, mainRecyclerViewAdapter, mainRecyclerViewAdapter2)

        val gridLayoutManager = GridLayoutManager(this, 3)

        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int =
                when (concatAdapter.getItemViewType(position)) {
                    R.layout.featured_item_layout -> 3
                    R.layout.carousel_item_layout -> 3
                    R.layout.shoppable_item_layout -> 3
                    R.layout.item_layout -> 1
                    else -> 1
                }
        }

        binding.mainRecyclerView.apply {
            layoutManager = gridLayoutManager
            adapter = concatAdapter
        }

    }

    override fun onItemClick(id: Int) {
        Toast.makeText(this, "$id", Toast.LENGTH_SHORT).show()
    }
}