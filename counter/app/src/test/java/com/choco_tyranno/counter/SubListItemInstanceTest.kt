package com.choco_tyranno.counter

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.util.*
import kotlin.collections.ArrayList

internal class SubListItemInstanceTest{

    @Test
    fun test(){
        val originList =  ArrayList<Item>()
        val item1 = Item()
        val item2 = Item()
        val item3 = Item()
        originList.add(item1)
        originList.add(item2)
        originList.add(item3)
        val subList = originList.subList(0,1)
        Assert.assertEquals(originList[0], subList[0])
    }

}

class Item