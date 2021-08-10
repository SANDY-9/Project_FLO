package com.example.project_flo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_flo.R
import com.example.project_flo.ui.activity.Song

/**
 * @author SANDY
 * @email nnal0256@naver.com
 * @created 2021-08-09
 * @desc
 */
class PagerAlbumAdapter(private val list: List<Song>) : RecyclerView.Adapter<PagerAlbumAdapter.HolderView>() {
    inner class HolderView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image : ImageView = itemView.findViewById(R.id.image)
        private val albums : TextView = itemView.findViewById(R.id.album)
        private val singer : TextView = itemView.findViewById(R.id.singer)
        fun setData(item : Song) {
            image.setImageResource(item.image)
            albums.text = item.name
            singer.text = item.singer
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PagerAlbumAdapter.HolderView {
        return HolderView(LayoutInflater.from(parent.context).inflate(R.layout.pager_item_album, parent, false))
    }

    override fun onBindViewHolder(holder: PagerAlbumAdapter.HolderView, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int = list.size

}