package operator

operator fun String.minus(right: Any?):String {
    return this.replaceFirst(right.toString(), "")
}

operator fun String.times(right: Int):String {
    return (1..right).joinToString(""){ this }
}

operator fun String.div(right: Any?):Int {
    val right = right.toString()
    return this.windowed(right.length, 1) {
        it == right
    }.count { it }
}

fun main() {
    var value = "HelloWorld"
    println(value - "World")
    println(value * 2)
    println(value / "ld")
}