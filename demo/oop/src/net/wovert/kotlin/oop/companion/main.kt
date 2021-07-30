package net.wovert.kotlin.oop.companion

/**
 * companion object 伴生对象
 * 在 Kotlin 中，与 Java 不同的是，类是没有 static 方法的
 * 在大多数庆奎昂下，Kotlin 推荐的方法是使用包级别的函数来作为静态方法
 * Kotlin 会将包级别的函数当作静态方法来看待
 * 如果不提供伴生对象的名字，那么编译器自动提供一个默认的名字 Companion
 * 注意：伴生对象的成员看起来像是 Java 中的静态成员，但是在运行期，他们依旧是真实对象的实例成员
 * 在 JVM 上，可以将伴生对象的成员真正成为类的静态方法与属性，这是通过 @JvmStatic 注解来实现的
 * 伴生对象编译后会生成静态内部类
 */
class MyTest {
    // 一个类中只允许有一个伴生对象
    companion object MyObject {
        //    companion object  {
        var a: Int = 100

        @JvmStatic
        fun method() {
            println("method invoked!")
        }

        fun foo() {
            println("foo invoked!")
        }
    }
}


fun main() {
    MyTest.method() // 类似与静态方法， kotlin 中没有静态方法
    println(MyTest.a)
    println("-------")

    val v = MyTest.MyObject
    println(v.javaClass) // MyTest$MyObject 相似内部类

}