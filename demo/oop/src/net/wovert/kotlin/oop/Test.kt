package net.wovert.kotlin.oop

fun main(args: Array<String>) {
    val son = Son()
    son.action()

    val m1 = Man("建安胖")
    m1.eat()
    val m2 = Woman("慈禧")
    m2.eat()

    var list = listOf<Human>(m1, m2)
    for(h in list) {
        h.eat()
    }
    println("------")

    val cnman = ChinaMan("Lucy")
    cnman.xiaodidi()
    cnman.eat()

    val w1 = Woman("Lily")
    w1.washing()

    println("-----")
    Singleton.print()

    println("----")
    var y1:YinZhangLei = YinZhangLei.小小驴()
    var y2:YinZhangLei = YinZhangLei.小骡子()

    var ylist = listOf<YinZhangLei>(y1, y2)
    for(y in ylist) {
        if (y is YinZhangLei.小骡子) y.sayHello()
    }

}