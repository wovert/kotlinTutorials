fun main(args: Array<String>) {
    var lists = listOf("A", "B", "c")
    for (ele in lists) {
        println(ele)
    }
    for ((i, e) in lists.withIndex()) {
        println("i=" + i + ",e=" + e)
    }
}

