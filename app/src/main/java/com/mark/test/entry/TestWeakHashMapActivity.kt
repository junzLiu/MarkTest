package com.mark.test.entry

import android.view.View
import java.util.*
import kotlin.collections.HashMap

/*
 * @title
 * @author MarkLiu
 * @description 
 * @create 2020/3/21-16:21
*/
class TestWeakHashMapActivity : BaseComputerActivity() {

    var index = 4
    var maxIndex = index
    val map = HashMap<Int, String>()
    val weakMap = WeakHashMap<Int, String>()

    override fun initComputer() {
        for (i in 0..3) {
            map[i] = "$i"
            weakMap[i] = "$i"
        }

        addButton("Add", View.OnClickListener {
            print("Add")
            map[index] = "$index"
            print("map[$index] = \"$index\"")
            weakMap[index] = "$index"
            print("weakMap[$index] = \"$index\"")
            maxIndex = ++index
        })

        addButton("minus", View.OnClickListener {
            print("minus")
            map.remove(index)
            print("map.remove($index)")
            weakMap.remove(index)
            print("weakMap.remove($index)")
            index--
        })

        addButton("return", View.OnClickListener {
            print("result")
            print("map->")
            for (i in 0..maxIndex) {
                print("map.contains key $i :${map.contains(i)}")
                print("map.contains $i :${map.containsValue("$i")}")
                print("weak.contains key $i :${weakMap.contains(i)}")
                print("weak.contains $i :${weakMap.containsValue("$i")}")
            }
            print("hashMap->")

        })
    }

}