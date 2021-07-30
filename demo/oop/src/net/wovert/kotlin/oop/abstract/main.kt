package net.wovert.kotlin.oop.abstract


open class BaseClass {
    open fun method() {}
}

abstract class ChildClass: BaseClass() {
    override abstract fun method()
}

fun main() {

}