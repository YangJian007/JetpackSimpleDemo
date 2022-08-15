package com.yang.livedata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.yang.livedata.livedata.AdvActivity2
import com.yang.livedata.map.MapActivity
import com.yang.livedata.switchmap.SwitchMapActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(Intent(this, AdvActivity2::class.java))
        }
        findViewById<Button>(R.id.btn1).setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            startActivity(Intent(this, SwitchMapActivity::class.java))
        }


    }
}