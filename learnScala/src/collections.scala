import scala.collection.mutable.ArrayBuffer
object collections {

  def main(args: Array[String]): Unit = {

    /////////////////////////////////// Array //////////////////////////////
    val array = Array(1,2,3,4,5,6,7,8,9,10,1,1,1,1,2,2,2,2,3,3,3,3,8)
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

    ////////////////////////////// ArrayBuffer /////////////////////////////
    val cars = new ArrayBuffer[String]()
    

  }

}
