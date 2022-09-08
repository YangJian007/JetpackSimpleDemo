package com.yang.hilt

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.yang.hilt.net.UserService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/*
在项目中使用Hilt Retrofit使用完整总结
https://blog.csdn.net/zhaoqp2010/article/details/122121914
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userService: UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launchWhenCreated {

            val userInfo = userService.userInfo("15225937677", "yang641052")
            Toast.makeText(this@MainActivity, userInfo.data.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}