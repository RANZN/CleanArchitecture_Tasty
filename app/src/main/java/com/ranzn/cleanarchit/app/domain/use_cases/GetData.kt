package com.ranzn.cleanarchit.app.domain.use_cases

import com.ranzn.cleanarchit.app.domain.repository.Repository

class GetData(private val repository: Repository) {
    operator fun invoke() =
        repository.getData()
}