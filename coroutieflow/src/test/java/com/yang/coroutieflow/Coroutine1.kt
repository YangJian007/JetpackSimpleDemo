package com.yang.coroutieflow

import org.junit.Test

/**
 * @author 杨剑
 * @fileName
 * @date 2022-09-05
 * @describe
 * @changeUser
 * @changTime
 */


class Coroutine1 {


    @Test
    fun test1() {
        pt("ss")
    }

    fun pt(msg: Any?) {
        println("-------------------------------------------")
        println(msg)
        println("-------------------------------------------")
    }

}