package net.wovert.kotlin.oop.extension

class A

val A.name : String
    get() = "hello"

fun main(args: Array<String>) {
    var a = A()
    println(a.name)
}