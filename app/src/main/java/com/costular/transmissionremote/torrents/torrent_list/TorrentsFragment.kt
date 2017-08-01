package com.costular.transmissionremote.torrents.torrent_list

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.costular.transmissionremote.MyApp
import com.costular.transmissionremote.R
import com.costular.transmissionremote.di.components.DaggerTorrentComponent
import javax.inject.Inject

/**
 * Created by costular on 29/07/17.
 */
class TorrentsFragment : Fragment() {

    @Inject
    lateinit var presenter: TorrentsPresenter

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root: View = inflater!!.inflate(R.layout.fragment_torrent_list, container, false)
        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        DaggerTorrentComponent.builder()
                .applicationComponent((activity.application as MyApp).applicationComponent)
                .build()
                .inject(this)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        presenter.initialize()
    }
}