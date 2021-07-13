fun main(args: Array<String>) {
   val arr = intArrayOf(1,2,3,4,5)
//   arr.forEach(){
//       println(it)
//   }
//    arr.forEach{ele -> println(ele)}
//    arr.forEach{println(it)}
//    arr.forEach(::println)

    arr.forEach ForEach@ {
        if (it === 2) return@ForEach // continue
        println(it)
    }


}