package com.example.assignment_first.activity.activity.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView


import com.example.assignment_first.R
import com.example.assignment_first.activity.activity.recyclerview.ui.RecyclerviewActivity

class FirstScreenActivity : AppCompatActivity() ,View.OnClickListener {

    var mEmailTV :TextView ?=null
    var mGoogleTV :TextView ?=null
    var mAppleTV:TextView ?=null
    var mFbTV:TextView ?=null
    var mEmailLL :RelativeLayout ?=null
    var mAppleLL :RelativeLayout ?=null
    var mGoogleLL :LinearLayout ?=null
    var mFbLL :LinearLayout ?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getAllIDS()
        mEmailLL!!.setOnClickListener(this)
        mAppleLL!!.setOnClickListener(this)


    }

    private fun getAllIDS() {
        mAppleLL = findViewById(R.id.ll_apple)
        mEmailLL = findViewById(R.id.ll_email)
       

    }

    override fun onClick(view : View?) {
        if (view!= null){
            when(view.id){
                R.id.ll_apple ->{
                    val intent= Intent(this , RecyclerviewActivity::class.java)
                    startActivity(intent)

                }
                R.id.ll_email -> {
                    val intent= Intent(this , SignUpScreenActivity::class.java)
                    startActivity(intent)
                }


            }
        }

    }
}
