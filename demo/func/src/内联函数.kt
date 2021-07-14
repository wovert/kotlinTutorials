fun main() {
    val ints = intArrayOf(1,2,3,4)
    ints.forEach {
        if (it == 3) return@forEach
        println("Hello $it")
    }
}