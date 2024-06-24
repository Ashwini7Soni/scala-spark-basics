object anonymousFunctions {
  def main(args: Array[String]): Unit = {
    val a = Array(1,2,3,4,5)
    // Anonymous function call below in the argument of map higher order function.
    val a1 = a.map(i => i * 2)
    println(a1.mkString(", "))

    // code to represent the same logic above
    val a2 = a.map(_*3)
    println(a2.mkString(", "))

    val stringArray = Array("India", "America", "England", "London", "Antarctica", "Japan")
    val s1 = stringArray.map(i => i.length)
    println(s1.mkString(", "))


  }

}
