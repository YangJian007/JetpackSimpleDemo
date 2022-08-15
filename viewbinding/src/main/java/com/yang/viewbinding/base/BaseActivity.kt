package com.yang.viewbinding.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-15
 * @describe
 * @changeUser
 * @changTime
 */
abstract class BaseActivity<T : ViewBinding> : AppCompatActivity() {

    lateinit var mViewBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mViewBinding = getViewBinding()
        setContentView(mViewBinding.root)
    }

    abstract fun getViewBinding(): T

}