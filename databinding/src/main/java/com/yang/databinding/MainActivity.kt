package com.yang.databinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yang.databinding.bindadapter.Test4Activity
import com.yang.databinding.click.Test2Activity
import com.yang.databinding.common.Test1Activity
import com.yang.databinding.databinding.ActivityMainBinding
import com.yang.databinding.doublebind.Test5Activity
import com.yang.databinding.layout.Test3Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.btn1.setOnClickListener {
            startActivity(Intent(this, Test1Activity::class.java))
        }
        viewBinding.btn2.setOnClickListener {
            startActivity(Intent(this, Test2Activity::class.java))
        }
        viewBinding.btn3.setOnClickListener {
            startActivity(Intent(this, Test3Activity::class.java))
        }
        viewBinding.btn4.setOnClickListener {
            startActivity(Intent(this, Test4Activity::class.java))
        }
        viewBinding.btn5.setOnClickListener {
            startActivity(Intent(this, Test5Activity::class.java))
        }

    }
}