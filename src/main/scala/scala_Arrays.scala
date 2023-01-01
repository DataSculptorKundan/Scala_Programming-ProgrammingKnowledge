import Array._

object scala_Arrays {
  val myArray : Array[Int] = new Array[Int](5)
  val myArray2 = new Array[Int](5)
  val myArray3 = Array(1,2,3,4,5,6,7,8,9,0,11,12,13)
  val myArray4 = Array("Orange","Apple","Banana","Guava","Tomato")

  def main(args: Array[String]) = {
    myArray(0) = 10
    myArray(1) = 20
    myArray(2) = 30
    myArray(3) = 40
    myArray(4) = 50

    println(myArray3.length)
    println(myArray4.length)

    val result = concat(myArray3,myArray)
    for (concatArray <- result){
      println(concatArray)
    }

    for (traverseArray <- myArray) {
      println(traverseArray)
    }

    for (traverseArray2 <- myArray2) {
      println(traverseArray2)   // default value of array[int]
    }

    for (traverseArray <- 0 to (myArray.length - 1)) {
      println(myArray(traverseArray))
    }
  }



}
