package seal

/**
 * 小母驴，小公驴，小公马生下来的儿子
 */
sealed class Son {
    fun sayHello() {
        println("大家好!")
    }

    class 小小驴():Son()
    class 小骡子():Son()
}