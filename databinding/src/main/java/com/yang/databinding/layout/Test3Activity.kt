package com.yang.databinding.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.databinding.R
import com.yang.databinding.common.User
import com.yang.databinding.databinding.ActivityTest3Binding

class Test3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding=ActivityTest3Binding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.user= User("里斯","34")
    }
}