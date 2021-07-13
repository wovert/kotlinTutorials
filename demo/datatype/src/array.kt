fun main(args: Array<String>) {
    var c0 = intArrayOf(1,2,3,4,5)
    var c1 = IntArray(5){it + 10}
    for (e in c0) {
        println(e)
    }
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