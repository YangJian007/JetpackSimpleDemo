package com.yang.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import com.yang.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    data class Person(
        var name: String,
        var age: Int
    )

    private val originData = MutableLiveData<Person>()

    //    private val mapData = Transformations.map(originData){
//        it.name
//    }
    private val mapData = originData.map {
        it.name
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        mapData.observe(this) {
            viewBinding.tv.text = it
        }

        viewBinding.btn.setOnClickListener {
            originData.value = Person("222", 3)
        }


    }
}