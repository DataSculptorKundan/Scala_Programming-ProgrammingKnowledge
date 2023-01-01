/*
A Set is a collection that contains no duplicate elements.
There are two kinds of Sets, the immutable and the mutable.
It's unordered collections.
By default, Scala uses the immutable Set.
If we want to use the mutable Set,
you'll have to import scala.collection.mutable.Set class explicitly.
 */

object scala_Sets {
  val myStringSets: Set[String] = Set("Max", "Tom", "John")
  val myIntSets: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val myIntSets2: Set[Int] = Set(1, 2, 3, 6, 7, 8, 9)

  def main(args: Array[String]) = {
    println(myIntSets)
    println(myStringSets)

    println(myIntSets.head)
    println(myIntSets.tail)
    println(myIntSets(10))
    println(myIntSets.isEmpty)


    println(myIntSets.concat(myIntSets2))
    println(myIntSets ++ myIntSets2)
    println(myIntSets.++(myIntSets2))

    println(myIntSets.intersect(myIntSets2))
    println(myIntSets.&(myIntSets2))

    println(myIntSets.max)
    println(myIntSets.min)

    myIntSets.foreach(println)

    for (name <- myStringSets)
      println(name)
  }
}
