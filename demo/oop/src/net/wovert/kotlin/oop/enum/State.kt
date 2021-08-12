package net.wovert.kotlin.oop.enum

// 同意实现接口
enum class State : Runnable {
    Idle, Busy {
        override fun run() {
            println("For Busy State.")
        }
    };
    override fun run() {
        println("For Every State.")
    }
}

// 给枚举定义扩种安
fun State.next(): State {
    return State.values().let {
        val nextOrdinal = (ordinal + 1) % it.size
        it[nextOrdinal]
    }
}

fun main(args: Array<String>) {
    State.Idle.run();
    State.Busy.run();

    val state: State = State.Idle
    val value = when(state) {
        State.Idle -> {0}
        State.Busy -> {1}
    }
    println(value)

    val colorRange = Color.White .. Color.Green
    val color = Color.Blue
    color in colorRange // false
}

enum class Color {
    White, Red, Green, Blue, Yellow, Black // 定义构造器
}

