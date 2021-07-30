package net.wovert.kotlin.oop.constructor

// 私有构造方法
//class Person private constructor(username: String) {

class Person constructor(username: String) {
    private var username: String
    private var age: Int
    private var address: String

    // 构造方法初始化
    init {
        println("init() running...")
        println(username)
        this.username = username
        this.age = 20
        this.address = "北京"
    }
    // secondary constructor
    // 必须直接或间接的调用 primary 构造方法
    // 会调用 constructor(username: String)
    constructor(username: String, age: Int) :this(username) {
        println("secondary constructor running...")
        println("$username, $age")
        this.username = username
        this.age = age
        this.address = "北京"
    }

    // 调用 constructor(username: String, age: Int)
    constructor(username: String, age: Int, address: String): this(username, age) {
        println("secondary2 constructor running...")
        println("$username, $age, ${address}")
        this.address = address
    }

    fun print() {
        println("username: ${username}, age: ${age}, address: ${address}")
    }
}