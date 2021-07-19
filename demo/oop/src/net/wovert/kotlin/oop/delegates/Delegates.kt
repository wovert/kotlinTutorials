package net.wovert.kotlin.oop.delegates

import kotlin.reflect.KProperty

class Delegates {
    val hello by lazy {
        "HelloWorld"
    }
    val hello2 by X() // getValue()
    var hello3 by X() // private value, setValue
}

class X {
    private var value:String ? = null
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("getValue: $thisRef -> ${property.name}")
        return value?: ""
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value:String) {
        println("setValue: $thisRef -> ${property.name} = $value")
        this.value = value
    }
}

fun main() {
    val delegates = Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
    delegates.hello3 = "value of hello3"
    println(delegates.hello3)
}