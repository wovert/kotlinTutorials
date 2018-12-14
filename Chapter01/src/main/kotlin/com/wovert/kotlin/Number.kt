package com.wovert.kotlin

fun main(args: Array<String>) {
    var number: Int = 30
    println(number)

    var age: Int = 0xff
    println(age)

    var status: Byte = 0b00000011
    println(status)

    var maxInt: Int = Int.MAX_VALUE
    var minInt: Int = Int.MIN_VALUE

    println(maxInt)
    println(Math.pow(2.0, 31.0) -1)
    println(minInt)
    println(- Math.pow(2.0, 31.0))

    var v: Long = 123L
    println(v)

    println(Long.MAX_VALUE)
    println(Math.pow(2.0, 63.0) -1)
    println(Long.MIN_VALUE)
    println(-Math.pow(2.0, 63.0))

    var f: Float = 3.14F
    println(f)

    println((0.0F/0.0F) == Float.NaN) // false
    println(Float.NaN)

    var b: Byte = 120
    println(b)

}