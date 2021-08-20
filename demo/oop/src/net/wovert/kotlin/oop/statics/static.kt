package net.wovert.kotlin.oop.statics

fun main(args: Array<String>) {
//    val a = minOf(args[0].toInt(), args[1].toInt())
    val latitude = Latitude.ofDouble(3.0)
//    val latitude2 = Latitude.ofLatitude(latitude)

    println(Latitude.TAG)

    println(Util.double(20))
}

class Person {
    fun test() {
        println("成员方法")
    }
}

// 静态类
object Util {
    fun double(num: Int) : Int {
        return num * 2
    }
}

class Latitude private constructor(val value: Double) {

    // 在普通类里，定义静态方法
    companion object {
        @JvmStatic
        fun ofDouble(double:Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }

        @JvmField
        val TAG:String = "Latitude"
    }
}