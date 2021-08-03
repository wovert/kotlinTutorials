package net.wovert.kotlin.oop.delayinit

/**
 * 延迟初始化
 * Kotlin 要求非空类型的属性必须要构造方法中进行初始化
 * 有时，这种要求不要方便，比如可以通过依赖注入或单元测试情况下进行属性的赋值
 *
 * 通过 lateinit 关键字标识属性为延迟初始化，需要满足如下3个条件：
 *
 * 1. lateinit 只能用在类体中声明的 var 属性上，不能用在 primary constructor 声明的属性上
 * 2. 属性不能拥有自定义的 setter 与 getter
 * 3. 属性类型需要为非空，且不能是原生数据类型
 */
class TheClass {
    lateinit var name: String
    fun init() {
        println("init invoked!")
        this.name = "张三"
    }
    fun print() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var theClass = TheClass()
    theClass.init()
    theClass.print()
}
