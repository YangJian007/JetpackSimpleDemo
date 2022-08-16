package com.yang.databinding.bindadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yang.databinding.R
import com.yang.databinding.databinding.ActivityTest4Binding

class Test4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBinding = ActivityTest4Binding.inflate(layoutInflater)
        setContentView(dataBinding.root)

        dataBinding.person = Person(
            "aaa",
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.jj20.com%2Fup%2Fallimg%2Ftp09%2F210F2130512J47-0-lp.jpg&refer=http%3A%2F%2Fimg.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1663226824&t=7a320d10525a8ce098ad1e7200587f57",
            1
        )

    }
}