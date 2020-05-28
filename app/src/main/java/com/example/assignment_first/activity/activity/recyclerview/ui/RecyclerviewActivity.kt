package com.example.assignment_first.activity.activity.recyclerview.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.assignment_first.R
import com.example.assignment_first.activity.activity.recyclerview.model.RecyclerUser
import com.example.assignment_first.activity.activity.recyclerview.ui.fragment.BrowserFragment
import com.example.assignment_first.activity.activity.recyclerview.ui.fragment.RatingFragment
import com.example.assignment_first.activity.activity.recyclerview.ui.fragment.StockFragment
import com.example.assignment_first.activity.activity.recyclerview.ui.fragment.UserFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class RecyclerviewActivity : AppCompatActivity(){


    private var bottomNavigation :BottomNavigationView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        bottomNavigation =findViewById(R.id.bottom)

       bottomNavigation?.menu?.getItem(0)?.setIcon(R.mipmap.user_unselect)
        bottomNavigation?.menu?.getItem(1)?.setIcon(R.mipmap.browser_unselect)
        bottomNavigation?.menu?.getItem(2)?.setIcon(R.mipmap.rating_unselect)
        bottomNavigation?.menu?.getItem(3)?.setIcon(R.mipmap.stock_unselect)
        val   userFragmwent=UserFragment(applicationContext)

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_container , userFragmwent)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()

        bottomNavigation?.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId){

                R.id.menu_user -> {
                    menuItem.setIcon(R.mipmap.user_select)
                 val   userFragmwent=UserFragment(applicationContext)
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container , userFragmwent)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.menu_browser -> {
                    menuItem.setIcon(R.mipmap.browser_select)
                    val   browserFragment=BrowserFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container , browserFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.menu_rating -> {
                    menuItem.setIcon(R.mipmap.rating_select)
                    val   ratingFragmwent=RatingFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container , ratingFragmwent)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.menu_stock -> {
                    menuItem.setIcon(R.mipmap.stock_select)
                    val   stockFragmwent=StockFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container , stockFragmwent)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }
            true
        }
        }




}
