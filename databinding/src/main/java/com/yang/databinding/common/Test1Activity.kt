package com.yang.databinding.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.databinding.R
import com.yang.databinding.databinding.ActivityTest1Binding
import com.yang.databinding.databinding.ActivityTest1BindingImpl

class Test1Activity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(dataBinding.root)

        dataBinding.btnSure.setOnClickListener {
            val user = getUser()
            dataBinding.user=user
        }

    }

    private fun getUser(): User {
        val name=dataBinding.etName.text.toString().trim()
        val id = dataBinding.etId.text.toString().trim()
        return User(name,id)
    }

}