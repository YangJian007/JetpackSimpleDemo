package com.yang.databinding.doublebind

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.yang.databinding.BR


/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-16
 * @describe
 * @changeUser
 * @changTime
 */
class User1 : BaseObservable() {

    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var id: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.id)
        }


}