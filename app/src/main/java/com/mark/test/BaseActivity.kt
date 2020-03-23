package com.mark.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.view_title.*

/*
 * @title 基类
 * @author MarkLiu
 * @description 
 * @create 2020/3/18-11:01
*/

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        backIv?.setOnClickListener { finish() }
        initView()
    }

    abstract fun initView()

    fun setTitle(title: String) {
        titleTv?.text = title
    }

    abstract fun getLayoutId(): Int


}