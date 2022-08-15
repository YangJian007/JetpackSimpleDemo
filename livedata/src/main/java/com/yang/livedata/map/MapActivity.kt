package com.yang.livedata.map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.yang.livedata.R

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val tv = findViewById<TextView>(R.id.tv)

        val viewModel = ViewModelProvider(this).get(StudentViewModel::class.java)
        viewModel.setStudent(Student("张三", 12, 100))
        viewModel._student.observe(this) {
            tv.text = it.toString()
        }


    }
}