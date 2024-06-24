
object passbyValueAndReference {
  def main(args: Array[String]): Unit = {
    passbyValue(getTime())
//    passbyName(getTime())
  }

  def getTime(): Long = {
    println("In getTime function...")
    return System.nanoTime()
  }
  def passbyValue(t: Long): Unit = {
    println("In passbyValue function")
    println(s"Time now in the passbyValue function is ${System.nanoTime()}")
//    println(t)
  }

  def passbyName(t: => Long): Unit = {
    println("In passbyReference function")
    println(s"Time now in the passbyReference function is ${System.nanoTime()}")

  }
}

