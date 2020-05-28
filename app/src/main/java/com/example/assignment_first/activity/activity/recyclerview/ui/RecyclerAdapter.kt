package com.example.assignment_first.activity.activity.recyclerview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_first.R
import com.example.assignment_first.activity.activity.recyclerview.model.RecyclerUser
import kotlinx.android.synthetic.main.item_list.view.*

class RecyclerAdapter(var items : ArrayList<RecyclerUser> , var clickListener: onNewsItemClickListener) : RecyclerView.Adapter<RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
       /* var user :RecyclerViewHolder = RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))
        return user*/

        return RecyclerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))

    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
       /* holder.s_no?.text= items.get(position).s_no
        holder.channal_name?.text= items.get(position).channal_Name
        holder.logo?.setImageResource(items.get(position).logo)
        holder.hourse.text=items.get(position).hourse.toString()
        holder.image.setImageResource(items.get(position).image)
        holder.description.text=items.get(position).description*/

        // accessing intialize function in it
        holder.initializeItem(items.get(position) , clickListener)





    }
}

class RecyclerViewHolder(itemview :View) : RecyclerView.ViewHolder(itemview) {
    var s_no= itemview.tv_s_no
    var logo= itemview.iv_Logo
    var channal_name=itemview.tv_channel_name
    var image=itemview.iv_image
    var description=itemview.description
    var hourse=itemview.hours

    // create function
    fun initializeItem(items: RecyclerUser, callback :onNewsItemClickListener) {
         s_no.text= items.s_no
         logo.setImageResource (items.logo)
         channal_name.text=items.channal_Name
         image.setImageResource(items.image)
         image.clipToOutline=true
         description.text=items.description
         hourse.text= items.hourse.toString()

        itemView.setOnClickListener{
            callback.onItemClick(items, adapterPosition)
        }


    }
}

interface onNewsItemClickListener{
    fun onItemClick(items: RecyclerUser , position: Int)
}
