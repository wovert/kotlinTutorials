package net.wovert.kotlin.oop

// by 代理委托模式
class Woman(name:String): Human(name), iWash by Man(name) {
    override fun eat() {
        println("${name}小口小口的吃")
    }

    override fun washing() {
        println("女人监管男人洗完")
        Man(name).washing()
        println("女人监管结束")
    }
}