package net.wovert.kotlin.oop.innerclass

// 内部类 (Inner Class)

/**
 * 嵌套类与内部类的区别与联系
 * 1. 嵌套类：对英语 Java 静态内部类（即有 static 关键字修饰的内部类），只要在一个类的内部定义了另外一个类，那么这个类就叫做嵌套类，相当于 Java 当中有 static 关键字修饰的内部类。
 * 2. 内部类：对应于 Java 中的非静态内部类（即 没有 static 关键字修饰的内部类），使用 inner 关键字在一个类的内部所定义的另外一个类就叫做内部类，相当于 Java 当中没有 static 关键字修饰的内部类。
 * 3.
 * 4.
 */
class OutterClass2 {
    private val str: String = "OuterClass2 HelloWorld"

    inner class InnerClass {
        fun innerMethod() = this@OutterClass2.str
    }

    // 局部嵌套类
    fun getName(): String {
        class LocalNestedClass {
            val name: String = "mytest"
        }
        var localNestedClass = LocalNestedClass()
        return localNestedClass.name
    }
}


fun main() {
    println(OutterClass2().InnerClass().innerMethod())

    println(OutterClass2().getName())
}
