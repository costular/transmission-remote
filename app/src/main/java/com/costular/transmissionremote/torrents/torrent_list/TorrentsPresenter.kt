package com.costular.transmissionremote.torrents.torrent_list

import android.support.annotation.MainThread
import com.costular.transmissionremote.torrents.TorrentRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by costular on 29/07/17.
 */
class TorrentsPresenter @Inject constructor(private val repository: TorrentRepository): TorrentsContract.Presenter {

    lateinit var torrentsView: TorrentsContract.View

    override fun initialize() {
        load()
    }

    override fun setView(view: TorrentsContract.View) {
        torrentsView = view
    }

    override fun onPause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load() {
        torrentsView.showLoading(true)

        repository.getTorrents()
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribeBy(
                        onNext = {
                            torrentsView.showLoading(false)
                            torrentsView.showTorrents(it)
                        },
                        onError = {
                            torrentsView.showLoading(false)
                            torrentsView.showError(it.message!!)
                        }
                )


    }
}