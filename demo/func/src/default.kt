fun main(args: Array<String>) {
    // 函数是表达式
    val result = sum(10, 20)
    println("result=${result}")

    var i = {x:Int, y:Int -> x + y}
    println("${i(10, 39)}")

    // 声明函数式表达式
    var j:(Int, Int) -> Int = {x, y -> x + y}
    println("${j(1,2)}")

    // 默认参数
    println("${sum()}")

    // 具名参数
    println("${sum(b=33)}")
}

fun sum(a: Int=20, b: Int=10) = a + b