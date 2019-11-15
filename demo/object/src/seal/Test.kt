package seal

import seal.Son

fun main(args: Array<String>) {
    var s1:Son = Son.小小驴()
    var s2:Son = Son.小骡子()
    var s3:Son = Son.小小驴()

    // 集合
    var list = listOf<Son>(s1, s2, s3)
    for (v in list) {
        if (v is Son.小小驴) {
            v.sayHello()
        }
    }
}