package net.wovert.kotlin.oop.innerclass

// 嵌套类
class OutterClass {
    private val str: String = "OuterClass HelloWorld"

    class NestedClass {
        fun nestedMethod() = "Welcome"
    }
}


fun main() {
    println(Outter.NestedClass().nestedMethod())
}
