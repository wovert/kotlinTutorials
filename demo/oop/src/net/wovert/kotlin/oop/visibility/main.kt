package net.wovert.kotlin.oop.visibility

/**
 * 可见性：visibility
 * 可见性修饰符：private, protected, internal(只能用在同一个模块中), public
 */

open class Parent {
    private val x = 3; // 本类可以访问
    protected open val y = 4; // 子类可以访问
    internal val z = 5; // 同一个模块中可以访问
}

class Child: Parent() {

}

fun main(args: Array<String>) {

}