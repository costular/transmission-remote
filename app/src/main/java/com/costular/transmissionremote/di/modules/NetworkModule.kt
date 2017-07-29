package com.costular.transmissionremote.di.modules

import com.costular.transmission_rc.api.TransmissionClient
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by costular on 28/07/17.
 */
@Module
class NetworkModule(val host: String){

    @Provides
    @Singleton
    fun providesRPCClient(): TransmissionClient = TransmissionClient.getInstance(host)


}