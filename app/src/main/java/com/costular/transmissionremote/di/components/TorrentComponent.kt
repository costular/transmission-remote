package com.costular.transmissionremote.di.components

import com.costular.transmissionremote.di.modules.NetworkModule
import com.costular.transmissionremote.di.modules.StorageModule
import com.costular.transmissionremote.di.modules.TorrentModule
import com.costular.transmissionremote.di.scopes.PerActivity
import com.costular.transmissionremote.torrents.torrent_list.TorrentsActivity
import com.costular.transmissionremote.torrents.torrent_list.TorrentsFragment
import dagger.Component

/**
 * Created by costular on 29/07/17.
 */
@PerActivity
@Component(
        dependencies = arrayOf(ApplicationComponent::class),
        modules = arrayOf(TorrentModule::class, NetworkModule::class, StorageModule::class)
)
interface TorrentComponent {

    fun inject(torrentsActivity: TorrentsActivity)

    fun inject(torrentsFragment: TorrentsFragment)
}