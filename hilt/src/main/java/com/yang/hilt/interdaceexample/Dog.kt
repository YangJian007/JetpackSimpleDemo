package com.yang.hilt.interdaceexample

import android.util.Log
import javax.inject.Inject

/**
 * @author 杨剑
 * @fileName
 * @date 2022-09-09
 * @describe
 * @changeUser
 * @changTime
 */
class Dog @Inject constructor():Animal {
    override fun eat() {
        Log.i("TAG", "狗吃屎")
    }
}