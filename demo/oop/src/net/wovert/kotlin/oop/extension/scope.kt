package net.wovert.kotlin.oop.extension


/**
 * 扩展的作用域
 * 1. 扩展函数所定义在的类实例叫做分发接收者（dispatch receiver）
 * 2. 扩展函数所扩展的那个类的实例叫做扩展接收者（extension receiver）
 * 3. 以上两个名字冲突时，扩展接受者优先级最高
 */

class DD {
    fun method() {
        println("DD method")
    }
}

class EE {
    fun method2() {
        println("EE method2")
    }

    fun DD.hello() {
        method() // 扩展接受者
        method2() // 分发接受者
    }

    fun world(dd: DD) {
        dd.hello()
    }

    fun DD.output() {
        println(toString()) // DD.toString() 扩展接受者
        println(this.toString()) // DD.toString() 扩展接受者
        println(this@EE.toString()) // EE.toString() 分发接受者EE
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main(args: Array<String>) {
    var dd = DD()
//    dd.hello()
    EE().test()
}
