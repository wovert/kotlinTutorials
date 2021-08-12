package net.wovert.kotlin.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HelloWorld {

}

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("kotlin coroutines")
    }

    println("hello")

    Thread.sleep(2000)

    println("world")
}