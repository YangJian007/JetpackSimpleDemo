package com.yang.lifecycle.way2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.yang.lifecycle.MainActivity
import com.yang.lifecycle.R

class AdvertisingActivity2 : AppCompatActivity() {

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
                startActivity(Intent(this@AdvertisingActivity2,MainActivity::class.java))
            }

        }
        findViewById<Button>(R.id.btn_cancel).setOnClickListener {
            startActivity(Intent(this@AdvertisingActivity2,MainActivity::class.java))
            finish()
        }

        lifecycle.addObserver(advertisingManager)
//        advertisingManager.start()

    }


//    override fun finish() {
//        super.finish()
//        advertisingManager.onCancel()
//    }

}