fun main(args: Array<String>) {
    var n1 = readLine()
    var n2 = readLine()

    try {
        var num1: Int = n1!!.toInt() // !!部位空
        var num2: Int = n2!!.toInt() // ? 为空

        println("${num1} + ${num2} = ${num1 + num2}")
    }  catch (e: Exception) {
        println("异常错误")
    }
}
