package com.yang.livedata.switchmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.yang.livedata.R

class SwitchMapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_map)

        val et = findViewById<EditText>(R.id.et)
        val tv = findViewById<TextView>(R.id.tv)

        val viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        viewModel.newScore.observe(this) {
            tv.text = "分数：$it"
        }

        findViewById<Button>(R.id.btn).setOnClickListener {
            viewModel.setStudentId(et.text.toString().trim().toInt())
        }


    }
}