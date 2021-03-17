package ru.bubbles.domain.common

import kotlinx.coroutines.flow.Flow

/**
 * @param R is result type
 */
interface FlowUseCaseWithoutParam<out R> {
    operator fun invoke() = execute().handleOn()
    fun execute(): Flow<Result<R>>
}