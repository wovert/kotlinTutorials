package net.wovert.kotlin.lambda

/**
 * 匿名对象只能在[局部变量]范围内或是被[private修饰的成员变量]范围内才能被识别出其真正的类型
 * 匿名对象当作一个 public 方法的返回的类型或是 public 属性的类型，那么该方法或是属性的真正类型就是
 * 该匿名对象所声明的父类型，如果没有声明任何类型，那么其类型就是Any；在这种情况下，匿名对象中所
 * 声明的任何成员都是无法访问的。
 */

class MyClass {
    private var myObject = object {
        fun output() {
            println("output invoked")
        }
    }

    fun myTest() {
        println(myObject.javaClass) // 匿名对象
        println(myObject::class.java)
        myObject.output()
    }
}

class MyClass2 {
    private fun method1() = object {
        val str = "hello"
    }
    // internal 声明的返回的类型是 any 类型，Any 类型没有 str 属性
    internal fun method2() = object {
        var str = "world"
    }
    fun test() {
        val str = method1().str
//        var str2 = method2().str
    }
}

fun main(args: Array<String>) {
    var myClass = MyClass()
    myClass.myTest()
}