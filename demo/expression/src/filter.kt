package com.wovert.java.collection;

fun main(args: Array<String>) {
    var list = listOf<Int>(30, 23, 20)
    println(list)
    var li = list.filter {
        it % 2 == 0
    }
    println(list)
    println(li)
}
