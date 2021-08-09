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
class HorizontalListAdapter(private val list: List<Song>) : RecyclerView.Adapter<HorizontalListAdapter.HolderView>() {
    inner class HolderView(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image : ImageView = itemView.findViewById(R.id.image)
        private val name : TextView = itemView.findViewById(R.id.name)
        private val singer : TextView = itemView.findViewById(R.id.singer)
        fun setData(item : Song) {
            image.setImageResource(item.image)
            name.text = item.name
            singer.text = item.singer
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderView {
        return HolderView(LayoutInflater.from(parent.context).inflate(R.layout.recycler_item_horizontal, parent, false))
    }

    override fun onBindViewHolder(holder: HolderView, position: Int) {
        holder.setData(list[position])
    }

    override fun getItemCount(): Int  = list.size
}