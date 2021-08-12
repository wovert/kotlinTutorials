package net.wovert.kotlin.generic

import kotlin.test.assertTrue

class ParameterizedClass<A>(private val value:A) {
    fun getValue(): A {
        return this.value;
    }
}

// 协变：读取 Producer out
class ParameterizedProducer<out T>(private val value: T) {
    fun get() : T {
        return this.value
    }
}

// 逆变: 写入 Consumer in
class ParameterizedConsumer<in T> {
    fun toString(value: T) : String {
        return value.toString()
    }
}

fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("Hello World")
//    println(parameterizedClass.getValue())
    assertTrue(parameterizedClass.getValue() is String) // 断言

    val parameterizedProducer = ParameterizedProducer("welcome")

    val myRef: ParameterizedProducer<Any> = parameterizedProducer
    // List<String> list2 = new ArrayList<>();
    // List<? extends Object> list = list2

    assertTrue(myRef is ParameterizedProducer<Any>)

    println("-----------")

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2 : ParameterizedConsumer<Int> = parameterizedConsumer
    assertTrue(myRef2 is ParameterizedConsumer<Int>)
    // List<Object> list = new ArrayList<>();
    // List<? super String> list2 = list

    println("-----------")


}