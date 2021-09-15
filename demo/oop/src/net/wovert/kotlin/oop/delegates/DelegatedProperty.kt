package net.wovert.kotlin.oop.delegates

import kotlin.reflect.KProperty

/**
 * 委托属性 (Delegated property)
 * 1. 延迟属性
 * 2. 可观测属性
 * 3. 非空属性
 * 4. map 属性
 */

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = "$thisRef, your delegated property name is ${property.name}"
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) = println("$thisRef, new value is $value")
}

class MyPropertyClass {
    var str: String by MyDelegate()
}

fun main() {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello world"
    println(myPropertyClass.str)
}