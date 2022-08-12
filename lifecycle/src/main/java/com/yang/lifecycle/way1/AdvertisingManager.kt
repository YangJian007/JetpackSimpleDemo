package com.yang.lifecycle.way1

import android.os.CountDownTimer
import android.util.Log

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-11
 * @describe
 * @changeUser
 * @changTime
 */
class AdvertisingManager {
    /**
     * 广告管理接口
     */
    interface AdvertisingManagerListener {
        /**
         * 计时
         * [second] 秒
         */
        fun timing(second: Int)

        /**
         * 计时结束进入主页
         */
        fun enterMainActivity()

    }


    private val TAG = "AdvertisingManager"
    //监听事件
    var advertisingManagerListener: AdvertisingManagerListener? = null
    //定时器
    private var countDownTimer:CountDownTimer?=object :CountDownTimer(5000,1000){
        override fun onTick(millisUntilFinished: Long) {
            //显示倒计时
            Log.i(TAG, "onTick: ${(millisUntilFinished / 1000).toInt()}秒")
            advertisingManagerListener?.timing((millisUntilFinished/1000).toInt())
        }

        override fun onFinish() {
            Log.i(TAG, "广告结束，进入主页")
           advertisingManagerListener?.enterMainActivity()
        }

    }

    /**
     * 开始计时
     */
    fun start() {
        Log.i(TAG, "开始计时")
        countDownTimer?.start()
    }

    fun onCancel() {
        Log.i(TAG, "取消计时")
        countDownTimer?.cancel()
        countDownTimer=null
    }



}