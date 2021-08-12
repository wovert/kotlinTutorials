package net.wovert.kotlin.generic

class Mynegeric<T>(t: T) {
    var variable: T
    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {
//    var myGeneric: Mynegeric<String> = Mynegeric<String>("Hello World")
    var myGeneric = Mynegeric("Hello World") // 类型推断
    println(myGeneric.variable)

    var myClass = MyClass<String, Number>("abc", 30)
    myTest(myClass)



}

// 协变(covariant) 与逆变 (controvariant)

// out 读取时
// in 写入
class MyClass<out T, in M>(t:T, m:M) {
    private var t: T
    private var m: M
    init {
        this.t = t
        this.m = m
    }
    fun get() : T = this.t
    fun set(m: M) {
        this.m = m
    }
}
fun myTest(myClass: MyClass<String, Number>) {
    var myObject : MyClass<Any, Int> = myClass
    println(myObject.get())
}