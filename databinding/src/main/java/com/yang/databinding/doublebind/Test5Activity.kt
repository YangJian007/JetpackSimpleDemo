package com.yang.databinding.doublebind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.databinding.R
import com.yang.databinding.databinding.ActivityTest5Binding

class Test5Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding=ActivityTest5Binding.inflate(layoutInflater)
        setContentView(dataBinding.root)

        dataBinding.user=User1()

    }
}