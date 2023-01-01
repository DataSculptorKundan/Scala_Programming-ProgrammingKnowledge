/*
Scala Lists are quite similar to arrays which means,
all the elements of a list have the same type but there are two important differences.
First, lists are immutable, which means elements of a list cannot be changed by assignment.
Second, lists represent a linked list whereas arrays are flat.
 */

import scala.collection.immutable

object scala_List {

  val myStringList: List[String] = List("Max", "Tom", "John")
  val myIntList: List[Int] = List(1,2,3,4,5,6,7,8,9)

  def main(args: Array[String]) = {
    println(myIntList)
    println(0::myIntList)
    println("Head Value : " + myIntList.head)
    println("Head Value : " + myStringList.head)
    println("tail Value : " + myIntList.tail)
    println(myIntList.isEmpty)
    println("Reverse Value : " + myIntList.reverse)
    println(List.fill(5)(7))
    println(1 :: 2 :: 3 :: 4 :: Nil)
    println("Max Value : " + myIntList.max)
    println("Min Value : " + myIntList.min)
    myIntList.foreach(println)

    var sum : Int = 0
    myIntList.foreach(sum += _)
    println(sum)

    for (name <- myStringList)
      println(name)

    println("Index Value of [1] : " + myStringList(1))
  }

}
