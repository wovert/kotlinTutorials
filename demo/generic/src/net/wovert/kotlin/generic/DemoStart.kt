package net.wovert.kotlin.generic

// star projection (星投影)

// Star<out T>: 如果 T 的上界是 TUpper, 那么 Start<*>就相当于 Start<out T>,
// 这表示当 T 的类型未知时，可以从Star<*> 当中安全的读取 TUpper 类型的值

// Start<in T>: Start<*> 就相当于 Star<in nothing>，这表示无法向其中写入任何值
// Star<T>, 如果 T 的上界为 TUpper, 那么 Star<*> 就相当于读取时的 Star<out TUpper>以及
// 写入时的 Star<in Nothing>

class Star<out T> {

}

class Star2<in T> {
    fun setValue(t: T) {

    }
}

class Star3<T>(private var t: T) {
    fun setValue(t:T) {

    }
    fun getValue(): T {
        return this.t
    }
}

fun main(args: Array<String>) {
    val star: Star<Number> = Star<Int>()
    var star2: Star<*> = star // Star<*> = Star<Number>

    val star3: Star2<Int> = Star2<Number>()
    val star4: Star2<*> = star3 // Star2<*> = Star2<Int>

//    star4.setValue(4) // compile error

    val star5: Star3<String> = Star3<String>("Hello")
    val star6: Star3<*> = star5

    star6.getValue()
//    star6.setValue() // compile error

    val list: MutableList<*> = mutableListOf("hello", "world", "hello world")
    println(list[0])

//    list[0] = "test" // compile error


}