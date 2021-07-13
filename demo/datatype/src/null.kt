fun test(str: String?) : String {
    return "test" + (str?:"")
}

fun main() {
    val result = test(" hello")
    println("result=${result}")

    val result2 = test(null)
    println("result2=${result2}")
}