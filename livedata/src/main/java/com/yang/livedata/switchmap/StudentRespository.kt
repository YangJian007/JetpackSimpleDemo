package com.yang.livedata.switchmap

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-15
 * @describe
 * @changeUser
 * @changTime
 */
class StudentRespository {


    fun getScoreById(id:Int):LiveData<Int>{
        val scoreLiveData=MutableLiveData<Int>()
        if (id == 1) {
            scoreLiveData.value = 90
        } else {
            scoreLiveData.value=60
        }
        return scoreLiveData
    }


}