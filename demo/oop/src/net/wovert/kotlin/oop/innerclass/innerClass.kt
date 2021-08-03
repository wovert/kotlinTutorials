package net.wovert.kotlin.oop.innerclass

class Outter {
    val a : Int = 0
    // 静态内部类: 内部类与外部没有关系时使用
//    class Inner {
    // 非静态内部类
    inner class Inner {
        val a : Int = 5
        fun hello() {
            println(this@Outter.a)
            println(this.a)
        }
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var onClickListener: OnClickListener? = null
}

fun main() {
    // 静态内部类
//    val inner = Outter.Inner()
    val inner = Outter().Inner()

    val view = View()


    view.onClickListener = object: OnClickListener {
        // 匿名内部类
        override fun onClick() {
            TODO("Not yet implemented")
        }

    }
}
