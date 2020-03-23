package com.mark.test.entry

import android.view.View
import android.widget.Button
import com.mark.test.BaseActivity
import com.mark.test.R
import kotlinx.android.synthetic.main.activity_base_computer.*

/*
 * @title 基础电脑界面
 * @author MarkLiu
 * @description 
 * @create 2020/3/18-11:45
*/
abstract class BaseComputerActivity : BaseActivity() {

    val buttons = arrayListOf<Button>()

    override fun getLayoutId() = R.layout.activity_base_computer

    override fun initView() {
        buttons.add(b_1_1)
        buttons.add(b_1_2)
        buttons.add(b_1_3)
        buttons.add(b_2_1)
        buttons.add(b_2_2)
        buttons.add(b_2_3)

        for (v in buttons)
            v.visibility = View.GONE
        initComputer()
    }

    abstract fun initComputer();

    fun addButton(text: String, listener: View.OnClickListener) {
        buttons[0].visibility = View.VISIBLE
        buttons[0].text = text
        buttons[0].setOnClickListener(listener)
        buttons.removeAt(0)
    }

    fun print(text: String) {
        screenTv.text = "${screenTv.text}\n$text"
    }

    fun clearScreen() {
        screenTv.text = ""
    }

}
