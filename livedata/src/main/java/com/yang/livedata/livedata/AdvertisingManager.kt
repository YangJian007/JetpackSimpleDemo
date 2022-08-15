package com.yang.livedata.livedata

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author 杨剑
 * @fileName
 * @date 2022-08-11
 * @describe
 * @changeUser
 * @changTime
 */
class AdvertisingManager(val viewModel: AdvViewModel) :LifecycleObserver{
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
//    var advertisingManagerListener: AdvertisingManagerListener? = null
    //定时器
    private var countDownTimer:CountDownTimer?=object :CountDownTimer(viewModel.milli,1000){
        override fun onTick(millisUntilFinished: Long) {
            //显示倒计时
            Log.i(TAG, "onTick: ${(millisUntilFinished / 1000).toInt()}秒")
//            advertisingManagerListener?.timing((millisUntilFinished/1000).toInt())
            viewModel.setTimingResult(millisUntilFinished/1000)

        }

        override fun onFinish() {
            Log.i(TAG, "广告结束，进入主页")
//           advertisingManagerListener?.enterMainActivity()
        }

    }

    /**
     * 开始计时
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun start() {
        Log.i(TAG, "开始计时")
        countDownTimer?.start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onCancel() {
        Log.i(TAG, "取消计时")
        countDownTimer?.cancel()
        countDownTimer=null
    }



}