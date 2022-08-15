package com.yang.livedata.switchmap

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-15
 * @describe
 * @changeUser
 * @changTime
 */
class ViewModel : ViewModel() {

    private var studentIdLiveData = MutableLiveData<Int>()

    fun setStudentId(id: Int) {
        studentIdLiveData.value = id
    }

    var newScore: LiveData<Int> = Transformations.switchMap(studentIdLiveData) {
        StudentRespository().getScoreById(it)
    }


}