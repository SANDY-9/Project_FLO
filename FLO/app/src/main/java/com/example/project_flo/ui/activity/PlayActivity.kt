package com.example.project_flo.ui.activity

import android.content.Context
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.marginEnd
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.project_flo.R
import com.example.project_flo.databinding.ActivityPlayBinding
import com.example.project_flo.ui.adapter.PagerAlbumAdapter
import com.example.project_flo.ui.custom.HorizontalMarginItemDecoration
import kotlin.math.abs

private const val TAG = "PlayActivity"

class PlayActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPlayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_play)
        with(binding) {
            viewPager.run {
                adapter = PagerAlbumAdapter(setDataVertical())
                offscreenPageLimit = 3
                clipToPadding = false
                clipChildren = false
                currentItem = 1
                setPadding(180, 0, 180, 0)
                val translationPageTransformer = ViewPager2.PageTransformer { page, position ->
                    page.apply {
                        translationY = abs(position) * 200f
                        scaleX = 1f
                        scaleY = 1f
                    }
                }
                setPageTransformer(CompositePageTransformer().also {
                    it.addTransformer(translationPageTransformer)
                })
            }
        }
    }

    private fun setDataVertical() = mutableListOf<Song>().apply {
        add(Song("신호등", R.drawable.list_01,"이무진"))
        add(Song("NEXT EPISODE", R.drawable.list_02,"AKMU (악뮤)"))
        add(Song("바라만 본다", R.drawable.list_03,"MSG워너비"))
        add(Song("Next Level", R.drawable.list_04,"aespa"))
        add(Song("Weekend", R.drawable.list_05,"태연 (TAEYEON)"))
        add(Song("Permission to Dance", R.drawable.list_06,"방탄소년단"))
        add(Song("신호등", R.drawable.list_01,"이무진"))
        add(Song("낙하 (with 아이유)", R.drawable.list_02,"AKMU (악뮤)"))
        add(Song("바라만 본다", R.drawable.list_03,"MSG워너비"))
        add(Song("Next Level", R.drawable.list_04,"aespa"))
        add(Song("Weekend", R.drawable.list_05,"태연 (TAEYEON)"))
        add(Song("Permission to Dance", R.drawable.list_06,"방탄소년단"))
    }
}

