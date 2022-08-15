package com.yang.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yang.viewbinding.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var fragmentMainBinding:FragmentMainBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //调用三参数的方法
        fragmentMainBinding=FragmentMainBinding.inflate(inflater,container,false)
        return fragmentMainBinding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        //注意要在onDestroy中把viewBinding置空，避免内存泄漏
        fragmentMainBinding=null
    }

}