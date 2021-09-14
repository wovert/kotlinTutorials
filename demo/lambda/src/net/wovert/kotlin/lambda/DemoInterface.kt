package net.wovert.kotlin.lambda

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main(args: Array<String>) {
    var myObject = object: MyInterface {
        override fun myPrint(i: Int) {
            println("i的值是${i}")
        }
    }
    myObject.myPrint(20)

    val myObject2 = object {
        init {
            println("初始化快执行")
        }
        var myProperty = "hello world"
        fun myMethod() = "myMethod()"
    }
    println(myObject2.myProperty)
    println(myObject2.myMethod())

    println("----")

    var myObject3 = object : MyInterface, MyAbstractClass() {
        override fun myPrint(i: Int) {
            println("i的值是${i}")
        }

        override val age: Int
            get() = 30

        override fun printMyAbstractClassInfo() {
            println("printlnMyAbstractClassInfo invoked")
        }

    }
    myObject3.myPrint(28)
    println(myObject3.age)
    println(myObject3.printMyAbstractClassInfo())
}