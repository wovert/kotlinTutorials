package net.wovert.kotlin.demo.helloworld

import java.util.function.Consumer

fun main(args: Array<String>) {
    println("Hello World!")

    val list:List<String> = listOf("Hello", "World", "Hello World")
    for(ele in list) {
        println(ele)
    }
    println("-------")
    list.forEach(Consumer { println(it) })
    println("-------")
    list.forEach(System.out::println)

    println("sum(a+b)")
    val c = sum(1, 2)
    println(c)
}

fun sum(a: Int, b:Int) : Int {
    return a + b
}