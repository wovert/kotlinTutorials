fun main(args: Array<String>) {
    // 字符串类型转换数字
    var str = "10"
    var y = 20
    var z = str.toInt() + y
    println("z=${z}")

    println("-----")
    println(conver2Upppercase(10))
    println(conver2Upppercase("20"))
    println(conver2Upppercase("abc"))

}

fun conver2Upppercase(str:Any) : String? {
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}