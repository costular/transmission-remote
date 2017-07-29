package com.costular.transmissionremote.torrents.torrent_list

import com.costular.transmission_rc.api.domain.TorrentInfo
import com.costular.transmissionremote.utils.BasePresenter

/**
 * Created by costular on 29/07/17.
 */
interface TorrentsContract {

    interface View {

        fun showLoading(isLoading: Boolean)

        fun showTorrents(torrents: List<TorrentInfo>)

        fun showError(message: String)
    }

    interface Presenter: BasePresenter<View> {

        fun initialize()

        fun load()

    }
}