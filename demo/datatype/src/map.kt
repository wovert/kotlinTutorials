import java.util.*

fun main(args: Array<String>) {

    var map = TreeMap<String, String>()
    map["name"] = "wovert"
    map["age"] = "20"
    map["work"] = "Beijing"

    for ((i, e) in map) {
        println("i=" + i + ",e=" + e)
    }
}

