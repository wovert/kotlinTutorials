/**
 * 集合：可变集合的大小可以动态改变
 */

fun main(){
    // 有序列表：元素可重复
    var intList2:MutableList<Int> = mutableListOf(1,2,3,4)
    intList2.add(1)
    intList2.add(2)
    intList2.add(3)
    intList2.add(2, 4)


    val intList: List<Int> = listOf(1,2,3,4)
//    intList.add(333) // error

    val ite = intList2.iterator()
    ite.forEach { it ->
        println("it:${it}")
    }
    intList2.clear() // 集合中的元素就会被清空，isEmpty=true, size=0
    println("length:${intList2.size}")
    intList2.add(1) // size=1
    intList2[0] = 333 // 修改下标对应的元素，index不能超过集合 size 的大小
    intList2.add(30)
    intList2.add(20)
    intList2.add(10)
    intList2.add(80)
    intList2.add(90)
    intList2.removeAt(1)
    println("isEmpty():${intList2.isEmpty()}")

    intList2.shuffle() // 随机排列元素
    intList2.sort() // 从小到大排序
    intList2.sortDescending() // 从大到小排序
    intList2.forEach {
        println("shuffle: $it")
    }


    // 无序集合：元素唯一的集合

    // 字典：键值对
    val map:Map<String, Any> = mapOf("name" to "benny", "age" to 20)
    var map2:Map<String, Any> = mutableMapOf("name" to "benny", "age" to 20)
    var map3:Map<String, Any> = mutableMapOf<String, Any>(Pair("Key", "value"))

    var stringList = ArrayList<String>()

    for(i in 0..10) {
        stringList.add("num:$i")
    }

    for (i in 0..10) {
        // 集合里可以存在运算符
        stringList += "num: $i"
    }

    val pair = "hello" to "kotlin"
    val pair2 = Pair("Hello", "kotlin")
    val first = pair.first
    val second = pair.second
    val (x,y) = pair2
    println("$first,$second")
    println("$x,$y")
}