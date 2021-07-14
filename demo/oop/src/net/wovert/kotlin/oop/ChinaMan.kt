package net.wovert.kotlin.oop

class ChinaMan(override var name:String): Human(name), iMan {
    override fun eat() {
        println("ChinaMan筷子吃饭")
    }
    override fun xiaodidi() {
        println("18cm小弟弟")
    }
}