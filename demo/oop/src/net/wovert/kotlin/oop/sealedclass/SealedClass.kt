package net.wovert.kotlin.oop.sealedclass

/**
 * 密封类 sealed class
 *
 */
sealed class Calculator

class Add: Calculator()
class Subtract: Calculator()
class Multiply: Calculator()

fun calculator(a: Int, b:Int, cal: Calculator) = when(cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

sealed class PlayerCmd {
    class Play(val url:String, val position: Long = 0): PlayerCmd()
    class Seek(val position: Long = 0): PlayerCmd()

    object Pause: PlayerCmd()

    object Resume: PlayerCmd()

    object Stop: PlayerCmd()
}

enum class PlayerState {
    IDLE, PAUSE, PLAYING
}

fun main() {
    println(calculator(1, 2, Add()))
    println(calculator(1, 2, Subtract()))
    println(calculator(1, 2, Multiply()))
}

