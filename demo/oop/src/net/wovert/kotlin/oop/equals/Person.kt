package net.wovert.kotlin.oop.equals

import java.util.HashSet

class Person(val age:Int, val name:String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        val other = (other as? Person)?: return false
        return other.age === age && other.name == name
    }

    override fun hashCode(): Int {
        var result = age
        result = 31 * result + name.hashCode()
        return result
    }
}

fun main() {
    var persons = HashSet<Person>()

    (0..5).forEach{
        persons += Person(20, "wovert")
    }

    println(persons.size)
}