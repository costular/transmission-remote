package com.costular.transmissionremote.di.modules

import android.content.Context
import com.costular.transmissionremote.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by costular on 28/07/17.
 */
@Module
class ApplicationModule(private val myApp: MyApp) {

    @Provides
    @Singleton
    fun provideApplication(): MyApp = myApp

    @Provides
    @Singleton
    fun providesContext(): Context = myApp.applicationContext

}