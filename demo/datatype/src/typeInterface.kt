fun main(args: Array<String>) {
    print("Please input first number:")
    var n1 = readLine()
    print("Please input second number:")
    var n2 = readLine()
    try {
        val num1:Int = n1!!.toInt()
        val num2:Int = n2!!.toInt()
        println("n1+n2=${num1 + num2}")
    } catch (e: Exception) {
        println("Please input number!!!")
    }

}