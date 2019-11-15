class Rect(var height:Int, var width:Int) {
    fun area(): Int {
        return this.width * this.height
    }
}

fun main(args: Array<String>) {
    println("oop start...")
    var r = Rect(20, 10)
    println(r.height)
    println(r.width)
    println(r.area())
}
