package com.costular.transmissionremote

import android.app.Application
import com.costular.transmissionremote.di.components.DaggerApplicationComponent
import com.costular.transmissionremote.di.modules.ApplicationModule

/**
 * Created by costular on 28/07/17.
 */
class MyApp : Application() {

    val applicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()

    }
}