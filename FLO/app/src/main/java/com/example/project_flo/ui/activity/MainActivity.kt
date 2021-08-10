package com.example.project_flo.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.project_flo.R
import com.example.project_flo.databinding.ActivityMainBinding
import com.example.project_flo.ui.adapter.HorizontalListAdapter
import com.example.project_flo.ui.adapter.VerticalListAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding) {
            recyclerVertical.adapter = VerticalListAdapter(setDataVertical())
            recyclerHorizontal.adapter = HorizontalListAdapter(setDataHorizontal())
            button.setOnClickListener {
                startActivity(Intent(this@MainActivity, PlayActivity::class.java))
            }
        }
    }

    private fun setDataVertical() = mutableListOf<Song>().apply {
        add(Song("신호등", R.drawable.list_01,"이무진"))
        add(Song("낙하 (with 아이유)", R.drawable.list_02,"AKMU (악뮤)"))
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

    private fun setDataHorizontal() = mutableListOf<Song>().apply {
        add(Song("DESSERT", R.drawable.list_07,"D2ear"))
        add(Song("prod by 라디 2", R.drawable.list_08,"라디 (Ra. D)"))
        add(Song("YOU & I", R.drawable.list_09,"빽가"))
    }
}

data class Song(
    val name : String,
    val image : Int,
    val singer : String
)