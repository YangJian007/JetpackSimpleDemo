package com.yang.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //在setContentView()之前声明viewBinding
        val activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.tv.text="1243"

    }
}