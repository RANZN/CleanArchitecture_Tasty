package com.ranzn.cleanarchit.app.domain.use_cases

import com.ranzn.cleanarchit.app.domain.repository.Repository


class GetAnotherData(private val repository: Repository) {
    operator fun invoke(pg: Int) = repository.getAnotherData(pg)
}