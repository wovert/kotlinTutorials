package net.wovert.kotlin.oop.extension

class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b : Int) = a - b
}

// 扩展: Extension
fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main(args: Array<String>) {
    var et = ExtensionTest()
    println(et.add(1, 3))
    println(et.subtract(3, 1))
    println(et.multiply(3, 1))

    println("---------")
    myPrint(AA())
    myPrint(BB())
}

// 扩展函数的解析是静态的
// 1. 扩展本身并不会真正的修改目标类，并不会目标中插入新的属性或是方法
// 2. 扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
// 3. 调用是由对象声明类型所决定的，而不是由对象实际类型决定

open class AA
class BB: AA() {
}

fun AA.a() = "a"
fun BB.a() = "b"

fun myPrint(aa: AA) {
    println(aa.a())
}