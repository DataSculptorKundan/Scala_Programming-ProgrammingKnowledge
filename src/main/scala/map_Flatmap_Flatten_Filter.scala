//map, flatMap, flatten and filter (Higher-order Methods)

object map_Flatmap_Flatten_Filter {

  val myList = List(1,2,3,4,5)
  val myMapList = Map(1-> "Potato", 2 -> "Tomato", 3 -> "Litchi")

  def main(args: Array[String]) = {
    println(myList.map(x => x * 2))
    println(myList.map(_ * 2))
    println(myList.map(x => x +2))
    println(myList.map(x => "hi" * 2))
    println(myList.map(x => x + "Hi"))
    println(myMapList.mapValues( x => x + "hi"))

    println("Hello".map(_.toUpper))

    println(List(List(1,3,5,7),List(2,4,6,8)))
    println(List(List(1,3,5,7),List(2,4,6,8)).flatten)

    println(myList.map(x => List(x, x+2)))
    println(myList.map(x => List(x, x+2)).flatten)
    println(myList.flatMap(x => List(x, x+2)))

    println(myList.filter(x => x % 2 == 0))
    println(myList.filter(x => x % 2 != 0))
  }

}
