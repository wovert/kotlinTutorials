fun main() {
  cost {
      var fibonacciNext = fibonacci()
      for (i in 0..10) {
          println(fibonacciNext())
      }
  }
    //region +折叠
    println("Hello World!")
    //endregion
}

inline fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println(System.currentTimeMillis() - start)
}

fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return {
        val next = first + second
        val current = first
        first = second
        second = next
        current
    }
}



