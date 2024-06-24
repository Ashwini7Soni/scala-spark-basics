import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


object collections {

  def main(args: Array[String]): Unit = {

    listDemo()
  }

  private def listDemo(): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    println(list)
    println(list.getClass)
    println(list.sum)
    println(list.min)
    println(list.max)


  }
  private def tupleDemo(): Unit = {
    val tuple1 = ("abcd", 1, 3.14, "Pagal")
    println(tuple1)
    println(tuple1.getClass)
    println(tuple1._3)
  }
  private def mapDemo(): Unit = {
    // Immutable Map
    var map = Map("1" -> "Apple", "2" -> "Ball", "3" -> "Cat", "4" -> "Dog")
    println(map)
    println(s"""map("3") = ${map("3")}""")
    println(map.keys)
    println(map.values)
    for(i <- map.keys) {
      println(map(i))
    }
    map += ("5" -> "Elephant")
    println(map)
    map -= ("1")
    println(map)

    val mutableMap = mutable.Map("12" -> "adierf", "13" -> "weufh8rgh")
    mutableMap("12") = "Potato"  // This line will error out for immutable map
    println(mutableMap)
  }

  private def arrayBufferDemo(): Unit = {
    ////////////////////////////// ArrayBuffer /////////////////////////////
    val cars = new ArrayBuffer[String]()
    cars += "  Hey"
    cars += "Cutie    "
    cars.insert(2, "Smile")
    println(cars)
    println(cars)
  }

  private def arrayDemo(): Unit = {
    /////////////////////////////////// Array //////////////////////////////
    val array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sum = array.sum
    println(sum)
    val distinct = array.distinct
    println(distinct.mkString(", "))
    val min = array.min
    println(min)
    val max = array.max
    println(max)
    // Printing the index value of the array
    println(array(1))
    //modify the value at a index
    array(5) = 89
    println(array.mkString(", "))
    println(array.sum)

  }

}
