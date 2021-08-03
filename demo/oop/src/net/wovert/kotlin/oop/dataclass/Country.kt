package net.wovert.kotlin.oop.dataclass

data class Country(val id:Int, val name:String) {
}

fun main() {
    val china = Country(0, "中国")
    println(china)
    println(china.component1()) // 0
    println(china.component2()) // 中国

    // 数据类解构
    val (id, name) = china

    println(id)
    println(name)

    // 数据类解构
    val pair = "hello" to "World"
    val (hello, world) = pair
    println(hello)
    println(world)
}