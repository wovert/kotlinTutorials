package net.wovert.kotlin.oop.delegates

interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val str: String): MyInterface {
    override fun myPrint() {
        println("welcome $str")
    }
}

/**
 * MyClass 委托给(by) myInterface 也就是构造参数 myInterface
 * 委托原理：
 *
 * by 关键字后面的对象实际上会被存储在类内部，编译器则会父接口中的所有方法实现出来，并且将实现转移给委托对象来去进行
 */
class MyClass(myInterface: MyInterface): MyInterface by myInterface {
    override fun myPrint() {
        println("hello world")
    }
}

fun main(args: Array<String>) {
    val myInterfaceImpl = MyInterfaceImpl("张三")

    MyClass(myInterfaceImpl).myPrint()
}