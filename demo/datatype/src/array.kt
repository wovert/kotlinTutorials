fun main(args: Array<String>) {
    // 1. arrayOf 创建数组，数组中的元素可以是任意数据类型
    val arr:Array<Any> = arrayOf(2, 10.2, "hello", true)
    for (e in arr) {
        println(e)
    }
    println("------")

    // 2. 创建指定大小的，所有元素都为空的数组。必须指定集合中的元素类型
    val arrayOfNulls: Array<String?> = arrayOfNulls<String>(5)
    arrayOfNulls[0] = "hello1"
    arrayOfNulls[1] = "hello2"
    arrayOfNulls[2] = "hello3"
    arrayOfNulls[3] = "hello4"
    arrayOfNulls[4] = "hello5"

    for(e in arrayOfNulls) {
        println(e)
    }
    println("------")

    // 3. 动态创建数组
    val asc: Array<String> = Array(5){ i -> (i * i).toString()}
    for(e in asc) {
        println(e)
    }
    println("------")

    // 4. 字节数组
    val bytes = ByteArray(5)
    bytes[0] = 0

    // 5.整型数组
    var c1 = IntArray(5){it + 10}
    for (e in c1) {
        println(e)
    }
    println("=======")

    var intArr = IntArray(5){100}
    for (e in intArr) {
        println(e)
    }
    println("=======")

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

    var f1 = floatArrayOf(1f, 3f, 4f, 5f)
    // 遍历
    f1.forEach { e ->
        println(e)
    }
    println("--------------------------------------------------")
    f1.forEachIndexed { index, item ->
        println("$index: $item")
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