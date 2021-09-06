package net.wovert.kotlin.generic

class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return this.t
    }

    fun setValue(t: @UnsafeVariance T) {
        this.t = t
    }
}

fun main(args: Array<String>) {
    var myStorage1:MyStorage<Int> = MyStorage(5)
    val myStorage2:MyStorage<Any> = myStorage1

    println(myStorage2.getValue())

    myStorage2.setValue("hello") // 泛型擦除
    println(myStorage2.getValue())

    val item = getValue<Int>(3)
    println(item)

    val item2 = getValue("hello")
    println(item2)

    var upperBounds = UpperBoundsClass2<String>()

}

// 泛型函数

fun <T> getValue(item: T) : T {
    return item
}

// List 及 List 下面的类型
class UpperBoundsClass<T: List<T>> {

}

// 多个上界: Comparable and Any
class UpperBoundsClass2<T> where T: Comparable<T>, T: Any {

}