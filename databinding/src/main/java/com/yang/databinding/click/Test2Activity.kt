package com.yang.databinding.click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.databinding.R
import com.yang.databinding.common.User
import com.yang.databinding.databinding.ActivityTest2Binding

class Test2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding=ActivityTest2Binding.inflate(layoutInflater)
        setContentView(dataBinding.root)

        dataBinding.user= User("张三","99")
        dataBinding.clickHandler=ClickHandler()

    }
}