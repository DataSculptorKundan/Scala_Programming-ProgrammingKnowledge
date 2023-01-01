/* A closure is a functions which uses one or more variables declared outside
   this functions.
 */

object scala_Closures {
  var number: Int = 20
  val add = (x: Int) => x + number

  val add_1 = (x: Int) => {
    number = x + number
    number
  }

  def main(args: Array[String]) = {
    number = 200
    println(add(50))
    println(add_1(50))
    println(number)
  }

}
