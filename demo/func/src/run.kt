

fun main(args: Array<String>) {
    testRun(Room("北京", 1000F, 20.3F))
}

data class Room(val address: String, val price: Float, val size: Float)

// 可以访问实例的共有属性和方法
fun testRun(room: Room) {
    room.run {
        println("Room: $address, $price, $size")
    }
}
