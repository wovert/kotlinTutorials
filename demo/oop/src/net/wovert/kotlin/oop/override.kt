package net.wovert.kotlin.oop

abstract class AA {
    open fun x():Int = 5
}

interface BB {
    fun x(): Int = 1
}
interface CC {
    fun x(): Int = 0
}

class DD(var y:Int = 0):AA(), BB, CC {

    override fun x(): Int {
        println("call x(): Int in DD")
        return if (y > 0) {
            y
        } else if (y < -200) {
            super <CC>.x()
        } else if (y < -100) {
            super <BB>.x()
        } else {
            super <AA>.x()
        }
    }
}

fun main(arg: Array<String>) {
    println(DD(3).x())
    println(DD(-10).x())
    println(DD(-110).x())
    println(DD(-10000).x())
}