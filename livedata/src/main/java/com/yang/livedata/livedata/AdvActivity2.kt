package com.yang.livedata.livedata

import android.content.Intent
import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.yang.livedata.MainActivity
import com.yang.livedata.R

class AdvActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv1)

        val tv = findViewById<TextView>(R.id.tv)
        //方式1：传统方式创建viewModel
        val advViewModel = ViewModelProvider(this).get(AdvViewModel::class.java)

        //方式2：以ktx库的方式创建viewModel，需要引入implementation("androidx.activity:activity-ktx:1.5.1")
//        val advViewModel by viewModels<AdvViewModel>()


        val advertisingManager = AdvertisingManager(advViewModel)
        lifecycle.addObserver(advertisingManager)
//        advertisingManager.advertisingManagerListener=object :AdvertisingManager.AdvertisingManagerListener{
//            override fun timing(second: Int) {
//                advViewModel.milli=second*1000L
//                tv.setText("$second")
//            }
//
//            override fun enterMainActivity() {
//                startActivity(Intent(this@AdvActivity2, MainActivity::class.java))
//                finish()
//            }
//
//        }
        advViewModel._timingResult.observe(this) {
            tv.text = "$it"
            if (it == 0L) {
                startActivity(Intent(this@AdvActivity2, MainActivity::class.java))
                finish()
            }
        }
        advertisingManager.start()

    }
}