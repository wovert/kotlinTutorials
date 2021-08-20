fun main() {
    eval()
}

fun eval() : String {
    // kotlin 1.3+ getValue() 可以使用
    return when (val value : Any = getValue()) {
        is Int -> "This is Int Type, value is $value".apply(::println)
        is String -> "This is Int String, value is $value".apply(::println)
        is Double -> "This is Int Double, value is $value".apply(::println)
        is Float -> "This is Int Float, value is $value".apply(::println)
        else -> "Unkonw Type".apply(::println)
    }
}

fun getValue(): Any {
    return 100
}