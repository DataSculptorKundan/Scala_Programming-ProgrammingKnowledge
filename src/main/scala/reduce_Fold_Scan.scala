/*
Scala - Reduce, fold and scan(Left/Right)
reduceLeft, reduceRight, foldRight, foldLeft, scanLeft and ScanRight
 */

object reduce_Fold_Scan {
  val myStringList = List("A","E","I","O","U")
  val myIntList = List(2,4,5,6,8)

  def main(args:Array[String]) = {
    println("Reduce Left : " + myIntList.reduceLeft(_ + _))   // 25
    println("Reduce Right : " + myIntList.reduceRight(_ + _))   //25

    println("Reduce Left : " + myIntList.reduceLeft(_ - _)) // 25
    println("Reduce Right : " + myIntList.reduceRight(_ - _)) //25

    println("Reduce Right : " + myStringList.reduceRight(_ + _))  //AEIOU
    println("Reduce Left : " + myStringList.reduceLeft(_ + _ ))   //AEIOU

    println("Reduce Right : " + myStringList.reduceRight((x,y) => {
      println(x + " " + y)
      x + y
    }))

    println("Reduce Left : " + myStringList.reduceLeft((x,y) => {
      println(x + " " + y)
      x + y
    }))

    println("Reduce Right : " + myIntList.reduceRight((x, y) => {
      println(x + " " + y)
      x + y
    }))

    println("Reduce Left : " + myIntList.reduceLeft((x, y) => {
      println(x + " " + y)
      x + y
    }))

    println(myIntList.foldRight(0)(_ + _))
    println(myIntList.foldLeft(0)(_ + _))

    println(myIntList.foldRight(100)(_ + _))
    println(myIntList.foldLeft(100)(_ + _))

    println(myStringList.foldRight("z")(_ + _))
    println(myStringList.foldLeft("z")(_ + _))

    println(myIntList.scanLeft(100)(_ + _))
    println(myIntList.scanRight(100)(_ + _))

    println(myIntList.scanLeft(0)(_ + _))
    println(myIntList.scanRight(0)(_ + _))

    println(myStringList.scanLeft("z")(_ + _))
    println(myStringList.scanRight("z")(_ + _))
  }

}
