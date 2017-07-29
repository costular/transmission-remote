package com.costular.transmissionremote.torrents

import com.costular.transmission_rc.api.domain.TorrentInfo
import io.reactivex.Observable

/**
 * Created by costular on 25/07/17.
 */
interface TorrentDataSource {

    fun getTorrents(): Observable<List<TorrentInfo>>

    fun getTorrent(id: Long): Observable<TorrentInfo>

    fun addTorrent(): Observable<TorrentInfo>

    fun removeTorrent(id: Long, deleteFiles: Boolean): Observable<Boolean>

}