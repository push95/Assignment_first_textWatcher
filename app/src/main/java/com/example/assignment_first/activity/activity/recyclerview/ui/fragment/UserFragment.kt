package com.example.assignment_first.activity.activity.recyclerview.ui.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.assignment_first.R
import com.example.assignment_first.activity.activity.recyclerview.model.RecyclerUser
import com.example.assignment_first.activity.activity.recyclerview.ui.RecyclerAdapter
import com.example.assignment_first.activity.activity.recyclerview.ui.onNewsItemClickListener
import com.example.assignment_first.activity.activity.ui.FirstScreenActivity

class UserFragment(context: Context) : Fragment() ,onNewsItemClickListener {

     lateinit var  arrayList: ArrayList<RecyclerUser>
     lateinit var rootview : View
      var  recyclerview:RecyclerView ?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        rootview= inflater.inflate(R.layout.fragment_user, container, false)
        recyclerview=rootview.findViewById(R.id.rv_recycler)
        arrayList = ArrayList()
        recyclerview!!.layoutManager =LinearLayoutManager(context)
        recyclerview!!.addItemDecoration(DividerItemDecoration(context,1))
        recyclerview!!.adapter =RecyclerAdapter(arrayList , this)
        addUserNews()

        return rootview
    }



    private fun addUserNews() {
       arrayList.add(RecyclerUser("1" , R.drawable.yahoo, "ABP NEWS" , "BKWAS CHANNEL " ,R.drawable.girl, 1))
        arrayList.add(RecyclerUser("2" , R.drawable.yahoo, "Yahoo" , "Social media " ,R.drawable.girl2, 5))
        arrayList.add(RecyclerUser("3" , R.drawable.yahoo, "ABP NEWS" , "BKWAS CHANNEL " ,R.drawable.corona, 6))
        arrayList.add(RecyclerUser("4" , R.drawable.yahoo, "microSoft " , "Software company" ,R.drawable.micro, 8))
        arrayList.add(RecyclerUser("5" , R.drawable.yahoo, "ABP NEWS" , "BKWAS CHANNEL " ,R.drawable.girl, 1))


   }

    override fun onItemClick(items: RecyclerUser, position: Int) {
       /* Toast.makeText(context,items.channal_Name, Toast.LENGTH_SHORT).show()*/

        when(position){

              /*  val intent = Intent(context, FirstScreenActivity::class.java)
            context.startActivity(intent)*/

        }


    }
}