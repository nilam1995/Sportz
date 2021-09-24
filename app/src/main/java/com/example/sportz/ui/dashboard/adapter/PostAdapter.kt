package com.example.sportz.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportz.R
import com.example.sportz.ui.dashboard.model.PlayerModel

class PostAdapter(
        private val context: Context?,
        private var postList: List<PlayerModel>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
      return  PostViewHolder(
              LayoutInflater.from(parent.context).inflate(
                      R.layout.each_row,
                      parent,
                      false
              )
      )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
       val post=postList.get(position)
        if (post.Iscaptain){
            holder.body.text = post.playerName+" (C)"
        }else if (post.Iskeeper){
            holder.body.text = post.playerName+" (WC)"
        }else{
            holder.body.text = post.playerName
        }
    }

    override fun getItemCount(): Int = postList.size
    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val body:TextView=itemView.findViewById(R.id.body)
    }

    fun setData(postList: List<PlayerModel>)
    {
        this.postList=postList
        notifyDataSetChanged()
    }
}