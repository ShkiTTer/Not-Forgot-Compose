package ru.bubbles.domain.common

import kotlinx.coroutines.flow.Flow

/**
 * @param P is parameter type
 * @param R is result type
 */
interface FlowUseCase<in P, out R> {
    operator fun invoke(param: P) = execute(param).handleOn()
    fun execute(param: P): Flow<Result<R>>
}