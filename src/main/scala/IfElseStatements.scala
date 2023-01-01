object IfElseStatements {
  def main(args: Array[String]): Unit = {
    val x = 20
    var res = ""
    if (x == 20) {
      res = "x == 20" }
      else {
        res = "x != 20"}
    println(res)

    val y = 50
    var result = if (y == 50) "y == 50" else "y != 50"
    println(result)

    val a = 15
    println(if (a == 18) "a == 15" else "a != 15")
      }
  }
