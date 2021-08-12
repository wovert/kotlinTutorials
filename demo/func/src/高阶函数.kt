import java.io.File
import java.lang.StringBuilder

class Person(var name: String, var age: Int)

class Hello {
    fun world() {
        println("Hello World")
    }
}

class PdfPrinter {
    fun println(any: Any) {
        kotlin.io.println(any)
    }
}

fun factorial(n: Int) : Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i}
}

fun main(args: Array<String>) {

    val arr = arrayOf("one", "trwo", "", "three")
    arr.forEach(::println)
    println("------------")

    val helloWorld = Hello::world

    arr.filter(String::isNotEmpty).forEach(::println)
    println("------------")

    // kotlin 1.1 支持
    val pdfPrinter = PdfPrinter();
    arr.forEach(pdfPrinter::println)
    println("------------")

    val list = listOf(1,3,5,10,8,2)
    var newList = ArrayList<Int>()
    list.forEach {
        val newElement = it * 2 + 3
        newList.add(newElement)
    }
    newList.forEach(::println)

    // 简写方法
    val newList2 = list.map {
        it * 2 + 3
    }
    newList2.forEach(::println)

    val newList3 = list.map(Int::toDouble)
    println("------------")

    var list2 = listOf(
        1..20,
        2..5,
        100..322
    )
    val flatList = list2.flatMap {intRage ->
//        intRage
        intRage.map { intElement ->
            "No. $intElement"
        }
    }
    flatList.forEach(::println)
    println("------------")

    // 整数合
    var list3 = listOf(
        1..20,
        2..5,
        100..322
    )
    val flatList2 = list3.flatMap { it }
//    flatList2.forEach(::println)
    println(flatList2.reduce{ acc, i -> acc + i})
    println("------------")

//    (0..6).map(::factorial).forEach(::println)

    // fold
    println((0..6).map(::factorial).fold(5) { acc, i -> acc + i})
    println("------------")

    println((0..6).map(::factorial).fold(StringBuilder()) { acc, i ->
        acc.append(i).append(",")
    })

    println((0..6).map(::factorial).foldRight(StringBuilder()) { i, acc ->
        acc.append(i).append(",")
    })

    println((0..6).joinToString(","))




    val person = Person("张三", 20)

    person.let {
        // it = person
        println(it)
    }
    person.let(::println)

    person.run {
        // this = person
        println(this)
    }
    person.run(::println)

    val person2 = person.also {
        it.name = "李四"
    }
    var person3 = person.apply {
        name = "王五"
    }

//    File("string.kt").inputStream().reader().buffered()
//        .use {
//            println(it.readLines())
//        }
}