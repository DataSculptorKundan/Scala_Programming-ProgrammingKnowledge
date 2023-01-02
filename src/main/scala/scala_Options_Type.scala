object scala_Options_Type {
  val myList: List[Int] = List(1,2,3,4,5)
  val myMap = Map(1->"Hello",2->"London",3->"Guava",4->"Litchi")
  val myOption: Option[Int] = None
  val myOption2: Option[Int] = Some(52)

  def main(args: Array[String]) = {
    println(myList.find(_ > 5))   // None
    println(myList.find(_ > 2))   // Some(3)
    println(myList.find(_ > 2).get) // 3
    //println(myList.find(_ > 5).get)   // Exception Error
    println(myMap.get(2))   // Some(London)
    println(myMap.get(2).get)     // London
    println(myMap.get(5))   // None
    println(myMap.get(5).getOrElse("No found")) // Not Found

    println(myOption.isEmpty)   // true
    println(myOption2.isEmpty)    // false
    println(myOption2.get)    // 52

  }

}
