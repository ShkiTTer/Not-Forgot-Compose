package ru.notforgotcompose.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import ru.notforgotcompose.app.di.KoinModules
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
        initLogging()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            androidLogger()

            modules(KoinModules.all)
        }
    }

    private fun initLogging() {
        Timber.plant(Timber.DebugTree())
    }
}