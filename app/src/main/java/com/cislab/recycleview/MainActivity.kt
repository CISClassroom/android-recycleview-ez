package com.cislab.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var linearLayout = LinearLayoutManager(this , RecyclerView.VERTICAL,false)
        var gridLayout = GridLayoutManager(this,2)

        recyclerView.layoutManager = linearLayout

        val users = ArrayList<User>()
        users.add(User("suay","Mr.",R.mipmap.ic_launcher))
        users.add(User("Wannaphong Phatthiyaphaibun","Mr.",R.drawable.tontan))
        users.add(User("NARUBATE PRAROD","Mr.",R.mipmap.ic_launcher))
        users.add(User("Panat Kum-in","Mr.",R.drawable.phai))
        users.add(User("suay","Mr.",R.mipmap.ic_launcher))

        var adapter = UserAdapter(users)
        recyclerView.adapter = adapter
    }
}
