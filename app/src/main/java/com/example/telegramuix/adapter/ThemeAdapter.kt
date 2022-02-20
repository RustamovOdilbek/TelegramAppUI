package com.example.telegramuix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuix.R
import com.example.telegramuix.model.Theme

class ThemeAdapter(var themes: ArrayList<Theme>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_appearance_view, parent, false)
        return ThemeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var theme = themes[position]
        if (holder is ThemeViewHolder){
            holder.iv_image_theme.setImageResource(theme.iv_image_theme)
            holder.iv_image.setImageResource(theme.iv_image)
        }
    }

    override fun getItemCount(): Int {
        return themes.size
    }


    class ThemeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_image_theme = view.findViewById<ImageView>(R.id.iv_image_theme)
        var iv_image = view.findViewById<ImageView>(R.id.iv_image)
    }


}
