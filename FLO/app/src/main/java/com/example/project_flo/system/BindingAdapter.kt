package com.example.project_flo.system

import android.widget.ImageView
import androidx.databinding.BindingAdapter

/**
 * @author SANDY
 * @email nnal0256@naver.com
 * @created 2021-08-10
 * @desc
 */
object BindingAdapter {

    @JvmStatic
    @BindingAdapter("BackgroundAlbumImage")
    fun setBackgroundAlbum(view: ImageView, resource:Int) {
        view.setImageResource(resource)
    }

}