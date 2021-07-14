package net.wovert.kotlin.oop

// sealet 印章类
sealed class YinZhangLei {
    fun sayHello() {
        println("Hello!!!")
    }
    class 小小驴():YinZhangLei()
    class 小骡子():YinZhangLei()
}