package net.wovert.kotlin.oop.singleton


// 定义单例，类加载时实例化对象
// Singleton 既是类名也是对象名
// public static final Singleton INSTANCE = new Singleton();
object SingleTon {

    // 不生成 getter/setter @JvmField, 静态变量
    @JvmField var x: Int = 2
    // 静态方法
    @JvmStatic fun y() {
        println("y invoked!")
    }
}

// 普通类的静态成员
class Foo {
    // 生成非静态 Field
    @JvmField var a: Int = 2
    // 伴生对象，与普通类同名的 object
    companion object {
        // 生成静态 Field
        @JvmField var x:Int = 2
        @JvmStatic fun y() {}
    }
}

fun main(args: Array<String>) {
    println(SingleTon.x)
    SingleTon.y()
}