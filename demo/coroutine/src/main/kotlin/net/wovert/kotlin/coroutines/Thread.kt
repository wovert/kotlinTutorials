package net.wovert.kotlin.coroutines

import kotlin.concurrent.thread

fun main() {
    // 线程
    thread {
        Thread.sleep(1000)
        println("kotlin thread")
    }

    println("hello")

    Thread.sleep(2000)

    println("world")
}