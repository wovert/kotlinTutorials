package net.wovert.kotlin.oop

class House

class Flower

class Countyard {
    private val house:House = House()
    private val flower:Flower = Flower()
}

class ForbiddenCity {
    // internal 模块内可见
    // protected 子类可见
    val houses = arrayOf(House(), House())
    val flowers = arrayOf(Flower(), Flower())
}


fun main(args: Array<String>) {
    val countyard = Countyard()
    val fc = ForbiddenCity()
    println(fc.flowers)
}