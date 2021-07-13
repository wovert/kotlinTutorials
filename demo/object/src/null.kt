fun main() {
    var nullable:String? = "hello"
    nullable = null // 可空类型
//    val length = nullable.length // 可能触发空指针，编译错误
//    val length = nullable!!.length // 强转为不可空类型
//    val length = nullable?.length // 为null时不妨问成员
    val length:Int? = nullable?.length?:0 // nullable为空时返回0
    println(length)
}