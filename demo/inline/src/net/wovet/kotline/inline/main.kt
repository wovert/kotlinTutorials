package net.wovet.kotline.inline

fun main(args: Array<String>) {
    cost {
        println("hello")
    }

    // region non-local return
    nonLocalReturn {
        return // 从外部函数返回，从main函数返回
    }
    /**
     * { return }()
     */

    val ints = intArrayOf(1,2,3,4);
    ints.forEach{
        if (it == 3) return@forEach // continue
        println("Hello $it")
    }


}

// crossinlin 禁止 non-local return 或 noinline(没有意义了，禁止函数参数被内联)
inline fun Runnable(crossinline block: () -> Unit) : Runnable {
    return object: Runnable {
        override fun run() {
            block() // 可能存在不合法的 non-local return, 因为block的调用处与定义处不在同一个调用上下文
        }
    }
}

inline fun nonLocalReturn(block: () -> Unit) {
    block()
}

inline fun cost(block: () -> Unit) : Unit {
    val start = System.currentTimeMillis();
    block()
    println(System.currentTimeMillis() - start)
}