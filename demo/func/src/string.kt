fun str(v:String?):String {
    return "str" + v
}

fun main(args: Array<String>) {
    var name = "wovert"
    name = str(null)
    println("name=" + name)
}
