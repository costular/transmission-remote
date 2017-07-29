package com.costular.transmissionremote.di.modules

import com.costular.transmission_rc.api.TransmissionClient
import com.costular.transmissionremote.torrents.TorrentRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by costular on 28/07/17.
 */
@Module
class TorrentModule {

    @Provides
    @Singleton
    fun provideTorrentRepository(client: TransmissionClient): TorrentRepository =
            TorrentRepository(client)

}