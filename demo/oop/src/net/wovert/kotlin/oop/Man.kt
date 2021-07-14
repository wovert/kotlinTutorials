package net.wovert.kotlin.oop

class Man(name: String) : Human(name), iWash {
    override fun eat() {
        println("${name}娃娃的叫")
    }

    override fun washing() {
        println("男人洗完")
    }
}