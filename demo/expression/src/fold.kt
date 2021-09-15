package com.wovert.java.collection;

import java.lang.StringBuilder

fun main(args: Array<String>) {
    var list = listOf<Int>(1, 2, 3)

    var li = list.fold(StringBuilder()) {
        acc, i -> acc.append(i)
    }
    println(list)
    println(li)
}
