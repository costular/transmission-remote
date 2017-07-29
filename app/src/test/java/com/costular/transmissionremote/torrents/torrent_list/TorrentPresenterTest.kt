package com.costular.transmissionremote.torrents.torrent_list

import com.costular.transmission_rc.api.domain.TorrentInfo
import com.costular.transmissionremote.BaseTest
import com.costular.transmissionremote.torrents.TorrentRepository
import io.reactivex.Observable
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.Mockito.*
import org.mockito.runners.MockitoJUnitRunner
import org.junit.Assert.*;

/**
 * Created by costular on 29/07/17.
 */
@RunWith(MockitoJUnitRunner::class)
class TorrentPresenterTest : BaseTest() {

    lateinit var torrentsPresenter: TorrentsPresenter

    @Mock
    lateinit var torrentsView: TorrentsContract.View

    @Mock
    lateinit var torrentsRepository: TorrentRepository

    @Mock
    lateinit var torrentInfo: TorrentInfo

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        torrentsPresenter = TorrentsPresenter(torrentsRepository)
        torrentsPresenter.setView(torrentsView)
    }

    @Test
    fun torrentsShouldLoadProperly() {
        // Mock the response
        `when`(torrentsRepository.getTorrents()).thenReturn(Observable.just(arrayListOf(torrentInfo)))

        torrentsPresenter.initialize()

        verify(torrentsView).showLoading(true)
        verify(torrentsRepository).getTorrents()
        verify(torrentsView).showLoading(false)
    }

    @Test
    fun torrentShouldFailAndShowMessage() {
        `when`(torrentsRepository.getTorrents()).thenReturn(Observable.error{Exception("Some went bad")})

        torrentsPresenter.initialize()

        verify(torrentsView).showLoading(true)
        verify(torrentsRepository).getTorrents()
        verify(torrentsView).showLoading(false)
        verify(torrentsView).showError(anyString())
    }


}