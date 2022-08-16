package com.yang.databinding.bindadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import com.yang.databinding.R

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-16
 * @describe
 * @changeUser
 * @changTime
 */
object ItemBind {


    @BindingAdapter(value = ["android:imgUrl"])
    @JvmStatic
    fun setImg(iv: ImageView, url: String) {
        Picasso.get().load(url).into(iv)
    }


    @JvmStatic
    @BindingAdapter(value = ["android:imgUrl", "android:gender"], requireAll = false)
    fun setPlaceImg(iv: ImageView, url: String, gender: Int) {
        if (gender == 0) {
            Picasso.get().load(url).placeholder(R.mipmap.gender0).into(iv)
        } else {
            Picasso.get().load(url).placeholder(R.mipmap.gender1).into(iv)
        }
    }


}