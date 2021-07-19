package net.wovert.kotlin.oop.extend

import java.lang.StringBuilder

fun main(args: Array<String>) {
    // 调用扩展方法
//    println("abc".multiply(16))
    println("abc" * 16)
    println("abc".a)
    println("abc".b)
}

//fun String.multiply(int: Int) : String {
//    val stringBuilder = StringBuilder()
//    for (i in 0 until int) {
//        stringBuilder.append(this)
//    }
//    return stringBuilder.toString()
//}

operator fun String.times(int: Int) : String {
    val stringBuilder = StringBuilder()
    for (i in 0 until int) {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

val String.a: String
    get() = "abc"

var String.b : Int
    set(value) {

    }
    get() = 5