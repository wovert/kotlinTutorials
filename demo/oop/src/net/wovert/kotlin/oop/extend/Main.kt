package net.wovert.kotlin.oop.extend

/**
 * 在 Kotlin 中，所有类在默认情况下无法被继承的，即在 Kotlin 中，所有类默认情况下都是 final 的
 * open 的含义与 final 相反
 */
open class Parent (name: String, age: Int) {

}

class Child(name:String, age: Int): Parent(name, age) {

}

open class Parent2(name: String) {

}

/**
 * 如果一个类没有 primary 构造方法，那么这个的类的每个 secondary 构造方法就需要通过
 * super 关键字来初始化父类型，或是通过其他 secondary 构造方法完成这个任务
 * 不同的 secondary 构造方法可以调用父类不同的构造方法
 */
class Child2: Parent2 {
    constructor(name: String) : super(name) {
    }
}

open class Fruit {
    open fun name() {
        println("Frut")
    }
    fun expirationData() {
        println("1 month")
    }
}

class Apple: Fruit() {
    override fun name() {
        println("Apple")
    }
}

open class Orange:Fruit() {
    // Orange 子类不能重写 name 方法
    final override fun name() {
        println("Orange")
    }
}

open class MyParent {
    open val name:String = "parent"
}

class MyChild : MyParent() {
    override val name:String = "child"
}

class MyChild2(override val name:String) : MyParent() {}

/**
 * 1. val 可以 override val
 * 2. var 可以 override val
 * 3. val 无法 override var
 *
 * 本质上，val 相当于 get 方法；var 相当于 get 与 set 方法
 */
open class MyParent3() {
    open fun method() {
        println("parent method")
    }
    open val name: String
        get() = "parent"
}

class MyChild3: MyParent3() {
    override fun method() {
        super.method()
        println("child method")
    }
    override var name: String
        get() = super.name + " and child"
        set(value) {}
}


fun main() {
    val apple = Apple();
    apple.name()
    apple.expirationData()

    println("-------------------------------")

    val myChild = MyChild()
    println(myChild.name)

    println("-------------------------------")
    val myChild3 = MyChild3()
    myChild3.method()
    println(myChild3.name)

}