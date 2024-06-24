object higherOrderFunctions {

  def main(args: Array[String]): Unit = {
    val s = Array(1,2,3,4,5,6,7,8,9,10)
    val s1 = s.map(doubler)
    println(s1.mkString("Array(", ", ", ")"))
  }

  def doubler(x: Int): Int = {
    x*2
  }

}
