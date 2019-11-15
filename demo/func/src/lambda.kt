
fun main(args: Array<String>) {

    var x:Int = 10
    var y:Int = 20

    var i = {x:Int, y:Int -> x+y} // 函数表达式
    var result = i(x, y)
    println("result=" + result)

    var j:(Int, Int)->Int = {x, y -> x + y}
    var res2 = j(10, 20)
    println("res2=" + res2)

}