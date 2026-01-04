package com.neilturner.fadeloop

import android.app.Application
import com.neilturner.fadeloop.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class FadeLoopApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@FadeLoopApplication)
            modules(appModule)
        }
    }
}
