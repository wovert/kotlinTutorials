package net.wovert.kotlin.oop

open class Person(name: String, age: Int) {
    init {
        println("Person init: ${this.javaClass.simpleName}, name=${name}, age=${age}")
    }
}

class Student(name: String, age:Int, school: String): Person(name, age) {
    init {
        println("Student init")
    }
}

fun main(args: Array<String>) {
//    println("Hello World!!!")
    val student = Student("Lucy", 20, "Center School")
    println(student is Person)

    var person: Person = Student("Lily", 18, "Center School")
    if (person is Student) {
        println(person)
    }

    var p: Person = Person("Mini", 20, )
    var s: Student? = p as? Student
    println(s) // null

    val a = A()
    a.num = 20
    println(a.num)

    val b = B()
//    b.num = 30
    println(b.num)

    println("-----")
    val c = C()
    println(c.e)
}

class A {
    var num = 0
        get() {
            println("A class in num get")
            return field
        }
        set(value: Int) {
            println("A class set num field")
            field = value
        }
}

class B {
    var num = 0
        get
        protected set
}

class X

class C {
    var d:Int = 0
    // 延时初始化
    lateinit var c:String
    //    lateinit val a:String // val不能延时初始化

    // val 延时初始化
    val e:X by lazy {
        println("init X")
        X()
    }
}