package net.wovert.kotlin.oop.objects

class Driver {

}

interface OnExternalDriverMountListener {
    fun onMount(driver: Driver) {

    }
    fun onUnmount(driver: Driver) {

    }
}

abstract class Player

object MusicPlayer: Player(), OnExternalDriverMountListener {
    override fun onMount(driver: Driver) {
        super.onMount(driver)
    }

    override fun onUnmount(driver: Driver) {
        super.onUnmount(driver)
    }
    val state:Int = 0

    fun play(url:String) {

    }

    fun stop() {

    }
}

// object 的构造器
object Singleton {
    init {
        // 可以有若干个 init
    }
}

fun main() {

}