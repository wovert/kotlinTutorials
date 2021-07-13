fun main() {
  val a = 10
  val b = 20
  var max = if (compare(a, b)) a else b
  println("${max}")
}
fun compare(a:Int, b:Int) : Boolean {
    return if (a > b)  true else false
}