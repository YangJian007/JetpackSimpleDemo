package com.yang.livedata.map

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
class StudentViewModel : ViewModel() {

    private var student = MutableLiveData<Student>()

    val _student: LiveData<Int>
        get() = Transformations.map(student) {
            it.score
        }


    fun setStudent(student: Student) {
        this.student.value = student
    }

}