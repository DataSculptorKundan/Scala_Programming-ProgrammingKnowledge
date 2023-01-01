object scala_Maps {
  val myMap : Map[Int,String] = Map(101 -> "Apple", 102 -> "Tomato", 103 -> "Guava")
  val myMap2 : Map[Int,String] = Map(104 -> "Dragon fruit", 105 -> "Cherry")

  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(101))
    println(myMap.contains(105))  // To avoid the exception error, if not match from map.
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)
    println(myMap.size)
    println(myMap.head)
    println(myMap.tail)

    myMap.keys.foreach { key =>
      //println("Key : " + key  + " " + "Values : " + myMap(key))
      println(key  + " : " + myMap(key))
    }

    println(myMap.concat(myMap2))
    println(myMap ++ myMap2)

  }

}
