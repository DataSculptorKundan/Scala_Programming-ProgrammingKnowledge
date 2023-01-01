object scala_Tuples {
  val myTuples: (Int, Int, String, Boolean, Float) = (1,2,"Hello",true, 225.05f)
  // val myTuples = (1,2,"Hello",true, 225.05f)
  val myTuples2: (Int, Boolean) = Tuple2(7, true)
  //val myTuples2 = new Tuple2(7, true)
  val myTuples3: (Int, String, (Int, Int)) = Tuple3(9, "kundan", (1, 8))
  //val myTuples3 = new Tuple3(9, "kundan", (1, 8))


  def main(args: Array[String]): Unit = {
    println(myTuples3)
    println(myTuples2)
    println(myTuples)

    println(myTuples._1)
    println(myTuples3._3)
    println(myTuples3._3._2)

    myTuples.productIterator.foreach{
      itr => println(itr)
    }

    println(27 -> "Kundan") // Will create another tuple

  }

}
