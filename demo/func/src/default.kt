import java.lang.StringBuilder

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

    val world: CharArray = charArrayOf('w','o','r','l','d')
    val res: String = append('h','e','l','l','o',' ', *world, offset=20)
    println(res)
}

fun append(vararg str: Char, offset: Int) : String {
    val result = StringBuffer()
    for (char in str) {
        result.append(char)
    }
    return result.toString()
}

fun sum(a: Int=20, b: Int=10) = a + b