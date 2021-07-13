fun main(args: Array<String>) {
    val intRange = 1..10 // [1,10] 1
    val charRange = 'a'..'z' step 5
    val longRange = 1L..100L step 10 // 1L
    var floatRange = 1F..10F

    val intRange1 = 1 until 10 // [1,10]
    val charRange1 = 'a' until 'z'
    val longRange1 = 1L until 100L // 1L until 100L, 不包含100L

    val intRange2 = 10 downTo 1 // [10,9,...1]
    val charRange2 = 'z' downTo 'a'
    val longRange2 = 100L downTo 1L // 1L until 100L

    println(intRange2.joinToString())
//    println(longRange1.joinToString())
//    println(floatRange.toString())


//
//    intRange.forEach{e -> println(e) }
//    charRange.forEach{e -> println(e) }
//    longRange.forEach{e -> println(e) }
//
//    intRange1.forEach{e -> println(e) }
//    charRange1.forEach{e -> println(e) }
//    longRange1.forEach{e -> println(e) }
//
//    intRange2.forEach{e -> println(e) }
//    charRange2.forEach{e -> println(e) }
//    longRange2.forEach{e -> println(e) }
}

