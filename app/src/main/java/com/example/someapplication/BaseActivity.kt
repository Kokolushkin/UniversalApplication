package com.example.someapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity(private val navigationNumber : Int) : AppCompatActivity(){
    fun setupBottomNavigation(){
        bottom_navigation_view.setIconSize(32f, 32f)
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity =
                when (it.itemId) {
                    R.id.navigation_main -> MainActivity::class.java
                    R.id.navigation_profile -> ProfileActivity::class.java
                    R.id.navigation_settings -> SettingsActivity::class.java
                    else -> {
                        Log.e("ERR", "unknow navigation clickked $it")
                        null
                    }
                }
            if(nextActivity != null){
                val intent = Intent(this, nextActivity)
                startActivity(intent)
                true
            } else {
                false
            }
        }
        bottom_navigation_view.menu.getItem(navigationNumber).isChecked = true
    }
}