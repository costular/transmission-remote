package com.costular.transmissionremote.torrents

import com.costular.transmission_rc.api.domain.TorrentInfo
import com.costular.transmission_rc.api.domain.TorrentInfoCollection
import io.reactivex.Observable

/**
 * Created by costular on 25/07/17.
 */
interface TorrentDataSource {

    fun getTorrents(): Observable<TorrentInfoCollection>

    fun getTorrent(id: Long): Observable<TorrentInfo>

    fun addTorrent(): Observable<TorrentInfo>

    fun removeTorrent(id: Long, deleteFiles: Boolean): Observable<Boolean>

}