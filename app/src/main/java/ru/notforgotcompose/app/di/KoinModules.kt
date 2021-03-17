package ru.notforgotcompose.app.di

import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module
import ru.bubbles.data.db.common.AppDatabase
import ru.bubbles.data.db.common.Database
import ru.bubbles.data.net.common.Network
import ru.notforgotcompose.BuildConfig

object KoinModules {
    private val databaseModule = module {
        single { Database.build(androidContext()) }
        single { get<AppDatabase>().getSessionDao() }
    }

    private val networkModule = module {
        single {
            Network.getRetrofit(
                url = BuildConfig.API_URL,
                client = Network.client,
                json = Network.json
            )
        }
    }

    private val apiModule = module { }

    private val dataSourceModule = module { }

    private val useCaseModule = module { }

    private val baseAppModule = module {
        loadKoinModules(
            listOf(
                databaseModule,
                dataSourceModule,
                useCaseModule
            )
        )
    }

    val all = listOf(
        baseAppModule,
        networkModule,
        apiModule,
        presentationModule
    )
}