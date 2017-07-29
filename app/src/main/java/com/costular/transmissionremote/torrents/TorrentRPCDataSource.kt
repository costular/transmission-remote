package com.costular.transmissionremote.torrents

import com.costular.transmission_rc.api.domain.TorrentInfo
import io.reactivex.Observable

/**
 * Created by costular on 25/07/17.
 */
class TorrentRPCDataSource() : TorrentDataSource {

    override fun getTorrents(): Observable<List<TorrentInfo>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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