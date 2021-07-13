fun main(args: Array<String>) {
    // 声明整型数组
    var c0: IntArray = intArrayOf(1,2,3,4,5)

    // 遍历数组
    for (e in c0) {
        println(e)
    }
    println("-----")

    // 遍历数组索引
    for (i in c0.indices) {
        println("c0[$i] = ${c0[i]}")
    }
    println("-----")

    // 遍历数组索引和元素
    for ((i, e) in c0.withIndex()) {
        println("c0[$i] = ${e}")
    }
    println("-----")


    var c1 = IntArray(5){it + 10}

    for (e in c1) {
        println(e)
    }
    println("=======")

    var f1 = floatArrayOf(1f, 3f, 4f, 5f)
    // 遍历
    f1.forEach { e ->
        println(e)
    }

    // 包含关系
    if (f1.any { it == 1f }) {
       println("1f exists in variable f1")
    }
    // 不包含关系
    if (!f1.any { it == 2f }) {
        println("2f not exists in variable f1")
    }

    for (i in 0 until f1.size) {
        println(f1[i])
    }

    for (i in f1.indices) {
        println(f1[i])
    }

}