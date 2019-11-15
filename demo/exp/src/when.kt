fun grade(score:Int) {
    when(score) {
        10 -> println("Perfect")
        9 -> println("优秀")
        8 -> println("及格")
        else -> println("需要加油")
    }
}

fun main(args: Array<String>) {
    grade(3)
}