package com.yang.databinding.click

import android.view.View
import android.widget.Toast
import com.yang.databinding.common.User

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-16
 * @describe
 * @changeUser
 * @changTime
 */
class ClickHandler {


    fun click1(view: View) {
        Toast.makeText(view.context, "点击事件1", Toast.LENGTH_SHORT).show()
    }


    fun click2(view: View, user: User) {
        Toast.makeText(view.context, user.toString(), Toast.LENGTH_SHORT).show()
    }

}