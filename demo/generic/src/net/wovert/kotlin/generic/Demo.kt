package net.wovert.kotlin.generic

import kotlin.test.assertTrue

// 协变类型，只能读取，并且是方法的返回类型值
// 如果泛型类仅仅将泛型作为其方法的输出类型，可以使用 out
interface Producer<out T> {
    fun produce(): T
}

// 如果泛型类仅仅将泛型作为其方法的输入类型，可以使用 in
interface Consumer<in T> {
    fun consumer(item: T)
}


/**
 * 泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么就不能使用 out 和 in 来修饰泛型
 */
interface ProducerConsumer<T> {
    fun product(): T
    fun consumer(item: T)
}

open class Fruit
open class Apple: Fruit()
class ApplePear: Apple()

class FruitProducer: Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")
        return Fruit()
    }
}

class AppleProducer: Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")
        return Apple()
    }
}

class ApplePearProducer: Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")
        return ApplePear()
    }
}

class Human: Consumer<Fruit> {
    override fun consumer(item: Fruit) {
        println("Consumer Fruit")
    }
}

class Man: Consumer<Apple> {
    override fun consumer(item: Apple) {
        println("Consumer Apple")
    }
}

class Boy: Consumer<ApplePear> {
    override fun consumer(item: ApplePear) {
        println("Consumer ApplePear")
    }
}

// use-site variance(type projection) 类型投影

// 数组的浅拷贝
// 加上 out 之后没有 不可能在from[i]里写入数据
fun copy(from: Array<out Any>, to: Array<Any>) {
    assertTrue(from.size == to.size) // 失败不执行下面代码
    for (i in from.indices) {
        to[i] = from[i]
    }
}

fun setValue(to: Array<in String>, index: Int, value: String) {
    to[index] = value
}

fun main() {
    val from: Array<Int> = arrayOf(1, 2, 3, 4)
//    val to: Array<Any> = Array<Any>(4, {it -> "hello" + it});
//    val to: Array<Any> = Array<Any>(4, {"hello" + it});
    val to: Array<Any> = Array<Any>(4) { _ -> "hello" };

    for (item in to) {
        println(item)
    }
    copy(from, to)
    println("**********")
    val arr : Array<String> = Array<String>(4) { _ -> "hello" }
    for (item in arr) {
        println(item)
    }
    setValue(arr, 1, "world")
    println("**********")
    for (item in arr) {
        println(item)
    }
    println("**********")
    val arr2 : Array<Any> = Array<Any>(4, {it -> "hello" + it})
    for (item in arr2) {
        println(item)
    }
    setValue(arr2, 1, "中国")
    println("**********")
    for (item in arr2) {
        println(item)
    }
    return

    // 对于 out 泛型来说，可以将子类型对象赋给父类型引用
    val producer1 : Producer<Fruit> = FruitProducer()
    val producer2 : Producer<Fruit> = AppleProducer()
    val producer3: Producer<Fruit> = ApplePearProducer()

    println("-----------")

    // 对与 in 泛型来说，可将父类型对象赋给子类型引用
    val consumer1 : Consumer<ApplePear> = Human()
    val consumer2 : Consumer<ApplePear> = Man()
    val consumer3 : Consumer<ApplePear> = Boy()


}