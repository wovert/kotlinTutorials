package net.wovert.kotlin.oop.overloads

class Overloads {
    @JvmOverloads
    fun a(num: Int = 0) {
        println(num)
    }
    fun a(string: String) {
        println(string)
    }

}

fun main() {
    val overloads = Overloads()
    overloads.a(20)
    overloads.a("abc")
}