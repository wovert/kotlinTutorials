package net.wovert.kotlin.oop.delegates

interface Api {
    fun a()
    fun b()
    fun c()
}

class ApiImp : Api {
    override fun a() {
        TODO("Not yet implemented")
    }

    override fun b() {
        TODO("Not yet implemented")
    }

    override fun c() {
        TODO("Not yet implemented")
    }
}

// 接口代理
class ApiWrapper(val api: Api): Api {
    override fun a() {
        api.a();
    }

    override fun b() {
        api.b();
    }

    override fun c() {
        api.c();
    }
}

// 对于对象 api 的唯一要求就是实现被代理的接口
class ApiWrapper2(val api: Api)
    : Api by api { // 对象 api 代理类 ApiWrapper2 实现接口 Api
    override fun c() {
        println("c is called.")
        api.c()
    }
}

fun main(args: Array<String>) {

}