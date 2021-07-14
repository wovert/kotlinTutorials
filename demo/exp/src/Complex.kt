class Complex(var real:Double, var imaginary:Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Any): Int {
        return real.toInt()
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    override fun toString():String {
        return "${real} + ${imaginary}i"
    }
}

class Book {
    infix fun on(any:Any): Boolean {
        return false
    }
}

class Desk

fun main(args: Array<String>) {
    val c1 = Complex(3.0, 4.0) // 3 + 4i
    var c2 = Complex(2.0, 7.5) // 2 + 7.5i
    println(c1 + c2)
    println(c1 + 5)
    println(c1 + "hello world")
    println(c1())
    println("-----")

    if (Book() on Desk()) {

    }
}