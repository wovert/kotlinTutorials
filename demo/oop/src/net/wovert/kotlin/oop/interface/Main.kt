package net.wovert.kotlin.oop.`interface`

interface A {
    fun method() {
        println("A")
    }
}
interface B {
    open fun method() {
        println("B")
    }
}

class AImp: A{
    override fun method() {
        super.method()
    }
}
class ABImp: A, B {
    override fun method() {
        super<A>.method() // call A.method()
        super<B>.method() // call B.method()
        println("ABI method")
    }

}

fun main() {
    var a1 = AImp()
    a1.method()

    var abi = ABImp()
    abi.method()

}