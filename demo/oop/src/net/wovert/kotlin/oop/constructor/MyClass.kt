package net.wovert.kotlin.oop.constructor

/**
 * primary 构造方法是类头（class header）的一部分，他位于类名后面，可以拥有若干参数
 * 如果 primary 构造方法没有任何注解或是可见行关键字修饰，那么 constructor 关键字可省略
 */
//class MyClass constructor(username: String) {
class MyClass (username: String) {
    // 成员属性
    private val username:String = username.toUpperCase()

    // 初始化代码块，类成员变量赋初始值，可以引用构造方法的参数
    init {
        println(username)
    }
}





fun main(args: Array<String>) {
//    val myClass = MyClass("wovert")
    val p1 = Person("张三")
    println("------------------------------------------")
    val p2 = Person("李四", 39)
    println("------------------------------------------")
    val p3 = Person("王五", 23, "上海")
    println("------------------------------------------")
    p1.print()
    p2.print()
    p3.print()
}