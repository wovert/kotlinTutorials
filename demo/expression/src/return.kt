fun main() {
    var list = listOf<String>("a", "b", "c")
    list.forEach {
        if (it == "b") return@forEach
        println(it)
    }
}