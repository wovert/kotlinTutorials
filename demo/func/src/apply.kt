

fun main(args: Array<String>) {
    testApply()
}

fun testApply() {
    ArrayList<String>().apply {
        add("one")
        add("two")
        add("3")
    }.let {
        println(it)
    }
}
