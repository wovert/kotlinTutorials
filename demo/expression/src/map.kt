fun main(args: Array<String>) {
    var list = listOf<Int>(30, 23, 20)
    println(list)
    var li = list.map {
        it * 2 + 1
    }
    println(li)
}