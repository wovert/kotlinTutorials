fun main(){
    val intList: List<Int> = listOf(1,2,3,4)
    var intList2:MutableList<Int> = mutableListOf(1,2,3,4)

    val map:Map<String, Any> = mapOf("name" to "benny", "age" to 20)
    var map2:Map<String, Any> = mutableMapOf("name" to "benny", "age" to 20)

    var stringList = ArrayList<String>()

    for(i in 0..10) {
        stringList.add("num:$i")
    }

    for (i in 0..10) {
        // 集合里可以存在运算符
        stringList += "num: $i"
    }

    val pair = "hello" to "kotlin"
    val pair2 = Pair("Hello", "kotlink")
    val first = pair.first
    val second = pair.second
    val (x,y) = pair2
    println(first + "," +second)
    println(x + "," + y)
}