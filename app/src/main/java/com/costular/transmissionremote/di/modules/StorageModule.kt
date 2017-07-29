package com.costular.transmissionremote.di.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides

/**
 * Created by costular on 28/07/17.
 */
@Module
class StorageModule(private val context: Context) {

    @Provides
    fun providesSharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }


}