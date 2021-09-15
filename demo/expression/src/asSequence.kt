fun main(args: Array<String>) {
    var list = listOf<Int>(30, 23, 20)
    println(list)
    list.asSequence().filter {
        println("filter:${it}")
        it % 2 == 0
    }.map {
        println("map:${it}")
        it * 2 + 1
    }.forEach {
        println("forEach: $it")
    }
}