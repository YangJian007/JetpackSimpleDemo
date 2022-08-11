package com.yang.lifecycle.way3

import android.app.Activity
import android.content.Intent

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.yang.lifecycle.MainActivity
import com.yang.lifecycle.R
import com.yang.lifecycle.way2.AdvertisingManager2

class AdvertisingActivity3 : Activity() ,LifecycleOwner{

    private lateinit var tv1:TextView
    private lateinit var advertisingManager: AdvertisingManager2
    private lateinit var lifecycleRegistry: LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertising1)

        tv1=findViewById(R.id.tv1)
        advertisingManager= AdvertisingManager2().apply {
            advertisingManagerListener=object :AdvertisingManager2.AdvertisingManagerListener{
                override fun timing(second: Int) {
                    tv1.text="倒计时：${second}秒"
                }

                override fun enterMainActivity() {
                    startActivity(Intent(this@AdvertisingActivity3,MainActivity::class.java))
                }

            }
        }

        findViewById<Button>(R.id.btn_cancel).setOnClickListener {
            startActivity(Intent(this@AdvertisingActivity3,MainActivity::class.java))
            finish()
        }
        lifecycleRegistry=LifecycleRegistry(this)
        lifecycleRegistry.currentState=Lifecycle.State.CREATED
        lifecycle.addObserver(advertisingManager)


    }


    override fun onDestroy() {
        super.onDestroy()
        lifecycleRegistry.currentState=Lifecycle.State.DESTROYED
    }

    override fun getLifecycle(): Lifecycle {
        return lifecycleRegistry
    }


}