package net.wovert.kotlin.oop.constructor

// val 声明类的声明成员属性，默认是 public 修饰符
class Student (private val username: String, private val age: Int, private val address: String) {
    fun print() {
        println("username: ${username}, age: ${age}, address: ${address}")
    }
}

/**
 * 如果构造方法拥有注解或是可见行修饰符，那么 constructor 关键字不能省略，并且它位于修饰符后面
 */
class Student2 private constructor(username: String) {

}

/**
 * 在JVM上，如果类的 primary 构造方法的所有参数都有默认值，那么 Kotlin 编译器就会为这个类生成一个不带参数的构造方法，
 * 这个不带参数的构造方法会使用这些参数的默认值，这个做的目的在于可以跟 Spring 等框架更好的集成
 */
class Student3(val username: String = "某某") {
    fun print() {
        println("username: ${username}")
    }
}

fun main() {
    val stu = Student("张三", 29, "重庆")
    stu.print()

    val stu3 = Student3()
    stu3.print()

    val stu3_1 = Student3("李四")
    stu3_1.print()
}