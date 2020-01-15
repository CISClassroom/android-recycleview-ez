package com.cislab.recycleview

import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val userList: ArrayList<User>):
RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup,viewType:Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout , parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(userList[position].name,userList[position].title)
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),
        View.OnClickListener{

        //attribute
        val textName = itemView.findViewById<TextView>(R.id.textName)
        val textTitle = itemView.findViewById<TextView>(R.id.textTitle)


        fun bindItem(name:String,title:String){
            textName.text = name
            textTitle.text = title
        }
        override fun onClick(v: View?) {
            Log.d(  "onClick",textName.text.toString()+"click");
        }

    }
}