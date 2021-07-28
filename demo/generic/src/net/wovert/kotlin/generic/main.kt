package net.wovert.kotlin.generic

fun main() {
    val max = maxOf("hello", "world")
    println(max)
}

// 添加类型约束， T需要实现 Compareable 接口
fun <T: Comparable <T>> maxOf(a: T, b:T) : T {
    return if (a > b ) a else b
}

// 多个约束
fun <T> callMax(a:T, b:T) where T: Comparable<T>, T:() -> Unit {
    if (a > b) a() else b()
}

// 多个泛型参数
fun <T, R> callMaxParam(a:T, b:T): R where T: Comparable<T>, T:() -> R, R: Number {
    return if(a > b) a() else b()
}

/**
 * class Map<K, V> where K: Serializable, V: Comparable<V>
 */