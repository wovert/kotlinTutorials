import java.io.File

class Person(var name: String, var age: Int)

fun main(args: Array<String>) {
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

    File("string.kt").inputStream().reader().buffered()
        .use {
            println(it.readLines())
        }
}