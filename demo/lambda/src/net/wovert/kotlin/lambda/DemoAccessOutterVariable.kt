package net.wovert.kotlin.lambda

/**
 * Kotlin 对象表达式中可以访问到外层的变量
 * 与 Java 不同的是，外层变量无需声明为 final
 */

fun main() {
    var i = 100

    var myObject = object {
        fun myMethod() {
            i++
        }
    }
    myObject.myMethod()
    println("i的值是${i}")
}