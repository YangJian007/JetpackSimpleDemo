package com.yang.viewbinding.base

import android.os.Bundle
import com.yang.viewbinding.databinding.ActivityMainBinding

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-15
 * @describe
 * @changeUser
 * @changTime
 */
class TestActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewBinding.tv.text = "79786788"
    }

}