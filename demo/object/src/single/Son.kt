package single

import single.Eat

object Son: Eat {
  override fun eat() {
      println("儿子在吃饭")
  }
}