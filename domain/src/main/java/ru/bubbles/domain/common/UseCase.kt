package ru.bubbles.domain.common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface UseCase<in P, out R> {
    suspend operator fun invoke(param: P, dispatcher: CoroutineDispatcher = Dispatchers.IO) =
        withContext(dispatcher) {
            execute(param)
        }

    suspend fun execute(param: P): R
}