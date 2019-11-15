fun main(args: Array<String>) {
    var name:String = "wovert"
    name = "xiuhong中国"
    println("My name is " + name)

    var content = """
        这时字符串模版内容,变量namde值是${name}. ${name.length}
    """
    println(content)

    var str1 = "hello"
    var str2 = "Hello"

    println(str1 == str2) // 区分大小写
    println(str1.equals(str2)) // 区分大小写
    println(str1.equals(str2, true)) // 不区分大小写
}

