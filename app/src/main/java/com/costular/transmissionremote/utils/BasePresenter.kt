package com.costular.transmissionremote.utils

/**
 * Created by costular on 29/07/17.
 */
interface BasePresenter<T> {

    fun setView(view: T)

    fun onPause()

    fun onResume()

    fun onDestroy()
}