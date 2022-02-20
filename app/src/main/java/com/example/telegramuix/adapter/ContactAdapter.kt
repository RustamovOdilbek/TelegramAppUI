package com.example.telegramuix.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramuix.model.Contact
import com.example.telegramuix.R

class ContactAdapter(var contacts: ArrayList<Contact>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_view, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var contact = contacts[position]
        if (holder is ContactViewHolder){
            holder.iv_profile_contact.setImageResource(contact.iv_profile_contect)
            holder.tv_name_contact.setText(contact.tv_name_contact)
            holder.tv_time_contact.setText(contact.tv_time_contact)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile_contact = view.findViewById<ImageView>(R.id.iv_profile_contact)
        var tv_name_contact = view.findViewById<TextView>(R.id.tv_name_contact)
        var tv_time_contact = view.findViewById<TextView>(R.id.tv_time_contact)
    }

}
