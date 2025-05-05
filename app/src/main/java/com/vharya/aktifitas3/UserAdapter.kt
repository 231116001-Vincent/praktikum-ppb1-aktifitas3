package com.vharya.aktifitas3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(
    private val context: Context,
    private val items: ArrayList<Users>
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.text_user_name)
        val address: TextView = itemView.findViewById(R.id.text_user_address)
        val gender: TextView = itemView.findViewById(R.id.text_user_gender)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.name.text = items[position].name
        holder.address.text = items[position].address
        holder.gender.text = items[position].gender

        val text = "${items[position].name} | ${items[position].age} | ${items[position].address} | ${items[position].gender}"
        holder.itemView.setOnClickListener {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }
}