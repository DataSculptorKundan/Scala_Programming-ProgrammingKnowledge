/* Currying is a technique of transforming a function
  that takes multiple arguments into a functions,
  that takes a single arguments.
 */

object scala_Currying {
  def add(x: Int, y: Int) = x + y

  def add2 (x: Int) = (y: Int) => x + y

  def add3 (x: Int) (y: Int) = x + y

  def main(args: Array[String]) = {
    println(add(20,30))

    println(add2(40)(50))

    val sum80 = add2(40)
    println(sum80(100))

    val sum50 = add3(52)_
    println(sum50(100))
  }

}
