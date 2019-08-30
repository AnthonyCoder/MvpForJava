package com.anthony.video.bean

/**
 * 创建时间:2019/8/28
 * 创建人：anthony.wang
 * 功能描述：
 */
class Test {
    var childKT:ChildKT = ChildKT("asd",1)
    fun test(){
        childKT.age
        childKT.apply {  }
    }
}