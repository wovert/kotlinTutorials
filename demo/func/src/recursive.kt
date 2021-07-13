fun main(args: Array<String>) {
    var num = 5
    val result = fact(num)
    println("!${num}=${result}")

    var times = 10000000
    var r = 0
    val res = add(times, r)
}

// 递归优化
fun fact(value: Int) : Int {
    println("第${value}次运算")
    if (value == 1) {
        return 1
    } else {
        return value * fact(value - 1)
    }
}

// 递归优化
tailrec fun add(value: Int, result: Int) : Int {
    println("第${value}次运算,result=${result}")
    if (value == 0) {
        return 1
    } else {
        return add(value - 1, result+value)
    }
}