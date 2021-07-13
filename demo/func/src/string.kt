fun str(v:String?):String {
    return "str" + v
}

fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}

fun main(args: Array<String>) {
    var name = "wovert"
    name = str(null)
    println("name=" + name)

    val (x,y,z) = multiReturnValues()
    println(x + y + z)
}
