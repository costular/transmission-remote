package com.costular.transmissionremote.torrents

import com.costular.transmission_rc.api.TransmissionClient
import com.costular.transmission_rc.api.domain.TorrentInfo
import io.reactivex.Observable
import javax.inject.Inject

/**
 * Created by costular on 25/07/17.
 */
class TorrentRepository @Inject constructor(private val client: TransmissionClient): TorrentDataSource {

    override fun getTorrents(): Observable<List<TorrentInfo>> {
        return Observable.empty()
    }

    override fun getTorrent(id: Long): Observable<TorrentInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addTorrent(): Observable<TorrentInfo> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeTorrent(id: Long, deleteFiles: Boolean): Observable<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}