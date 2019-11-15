fun main(args: Array<String>) {
    var num = 1..20
    for (a in num step 2) {
        println(a)
    }
    var num2 = num.reversed()
    for (a in num2) {
        println(a)
    }

    println("num2 count=" + num2.count())
}