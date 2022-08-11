package com.yang.lifecycle.way1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.yang.lifecycle.MainActivity
import com.yang.lifecycle.R
import com.yang.lifecycle.way2.AdvertisingManager2

class Advertising1Activity : AppCompatActivity() {

    private lateinit var tv1:TextView
    private lateinit var advertisingManager: AdvertisingManager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertising1)

        tv1=findViewById(R.id.tv1)
        advertisingManager= AdvertisingManager2()
        advertisingManager.advertisingManagerListener=object :AdvertisingManager2.AdvertisingManagerListener{
            override fun timing(second: Int) {
                tv1.text="倒计时：${second}秒"
            }

            override fun enterMainActivity() {
                startActivity(Intent(this@Advertising1Activity,MainActivity::class.java))
            }

        }
        findViewById<Button>(R.id.btn_cancel).setOnClickListener {
            startActivity(Intent(this@Advertising1Activity,MainActivity::class.java))
            finish()
        }

        advertisingManager.start()

    }


    override fun finish() {
        super.finish()
        advertisingManager.onCancel()
    }

}