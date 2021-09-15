fun main(args: Array<String>) {
    var list = listOf(1,2,3,4)
    list.flatMap {
        0 until it
    }.joinToString().let(::println) // 0,   0, 1,   0, 1, 2,   0, 1, 2, 3

}