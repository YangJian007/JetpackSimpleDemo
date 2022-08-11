package com.yang.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yang.lifecycle.way1.Advertising1Activity
import com.yang.lifecycle.way2.AdvertisingActivity2
import com.yang.lifecycle.way3.AdvertisingActivity3

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn1 -> {
                startActivity(Intent(this, Advertising1Activity::class.java))
            }
            R.id.btn2 -> {
                startActivity(Intent(this, AdvertisingActivity2::class.java))
            }
            R.id.btn3 -> {
                startActivity(Intent(this, AdvertisingActivity3::class.java))
            }
        }
    }
}