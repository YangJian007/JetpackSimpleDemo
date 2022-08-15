package com.yang.livedata.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-12
 * @describe
 * @changeUser
 * @changTime
 */
class AdvViewModel:ViewModel() {


    var milli=5000L

    private var timingResult=MutableLiveData<Long>()

    fun setTimingResult(result: Long) {
        timingResult.value=result
    }

    val _timingResult:LiveData<Long>
        get() = timingResult


}