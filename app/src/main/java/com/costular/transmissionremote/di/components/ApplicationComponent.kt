package com.costular.transmissionremote.di.components

import android.content.Context
import com.costular.transmissionremote.MyApp
import com.costular.transmissionremote.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by costular on 25/07/17.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(myapp: MyApp)

    fun context(): Context


}
