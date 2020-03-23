package com.mark.test

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.mark.test.entry.TestWeakHashMapActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), OnItemClickListener {

    val datas: MutableList<Entry> = arrayListOf()

    override fun getLayoutId() = R.layout.activity_main

    override fun initView() {
        initData()
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = MainAdapter(this, datas, this)
    }

    private fun initData() {
        datas.add(Entry("HashMap与WeekHashMap",TestWeakHashMapActivity::class.java))
    }

    override fun onItemClickListener(position: Int, view: View) {
        startActivity(Intent(this, datas[position].clazz))
    }
}
