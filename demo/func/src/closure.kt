val string = "HelloWorld"

fun makeFun(): () -> Unit {
    var count = 0
    return fun() {
        println(++count)
    }
}

fun fibonacci() : () -> Long {
    var first = 0L
    var second = 1L
    return fun(): Long {
        val result = second
        second += first
        first = second - first
        return result
    }
}

fun fibonacciIterator() : Iterable<Long> {
    var first = 0L
    var second = 1L
    return Iterable {
        object: LongIterator() {
            override fun hasNext() = true
            override fun nextLong(): Long {
                val result = second
                second += first
                first = second - first
                return result
            }
        }
    }
}

fun add(x:Int) = fun(y: Int) = x + y

fun add2(x: Int) : (Int) -> Int {
    data class Person(val name:String, val age: Int) {

    }
    return fun(y: Int) : Int {
        return + y
    }
}

fun main() {
    val x = makeFun()
    x()
    x()
    x()
    println("---------")
    val f = fibonacci()
    println(f())
    println(f())
    println(f())
    println(f())
    println(f())
    println(f())
    println("---------")
    for(i in fibonacciIterator()) {
        if (i > 100) break
        println(i)
    }
    println("---------")
    val a = add(5)
    println(a(2))

}