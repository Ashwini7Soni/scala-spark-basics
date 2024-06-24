object Main {
  def main(args: Array[String]): Unit = {
    printSomething("Haalaluya")
    forLoop()

  }

  def printSomething(something: String): Unit = {
    println(something)
  }

  def forLoop(): Unit = {
    for (i <- 1 to 10) {
      for (j <- 1 to i) {
        print("*")
      }
      println("")
    }
  }
}