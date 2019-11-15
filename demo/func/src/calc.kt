fun main(args: Array<String>) {
    println("function demo")
    var a:Int = 100
    var b:Int = 3
    println("a+b=" + plus(a, b))
    println("a-b=" + sub(a, b))
    println("a*b=" + mult(a, b))
    println("a/b=" + devide(a, b))
}

fun plus(a:Int, b:Int):Int {
    return a + b
}

fun sub(a:Int, b:Int):Int {
    return a - b
}

fun mult(a:Int, b:Int):Int {
    return a * b
}

fun devide(a:Int, b:Int):Int {
    return a/b
}