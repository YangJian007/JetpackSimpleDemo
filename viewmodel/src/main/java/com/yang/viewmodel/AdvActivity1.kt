package com.yang.viewmodel

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdvActivity1 : AppCompatActivity() {

    private lateinit var advertisingManager: AdvertisingManager
    private var time:Long=5000


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adv1)

        val textView = findViewById<TextView>(R.id.tv)
        savedInstanceState?.let {
            time=it.getLong("milli")
        }
        advertisingManager = AdvertisingManager(time)
        lifecycle.addObserver(advertisingManager)
        advertisingManager.advertisingManagerListener =
            object : AdvertisingManager.AdvertisingManagerListener {
                override fun timing(second: Int) {
                    time=second*1000L
                    textView.text = "$second 秒"
                }

                override fun enterMainActivity() {
                    startActivity(Intent(this@AdvActivity1, MainActivity::class.java))
                    finish()
                }
            }

        advertisingManager.start()

    }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putLong("milli", time)
    }


}