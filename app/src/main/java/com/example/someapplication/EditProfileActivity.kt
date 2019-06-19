package com.example.someapplication

import android.os.Bundle
import android.util.Log

class EditProfileActivity : BaseActivity(2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        setupBottomNavigation()
        Log.d("TAG","edit profile onCreate")
    }
}