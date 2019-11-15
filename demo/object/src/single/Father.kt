package single

import single.Eat
import single.Son

object Father: Eat by Son {
  override fun eat() {
      println("爸爸开始")
      Son.eat() // 代理儿子
      println("爸爸在吃饭")
      println("爸爸结束")

  }
}