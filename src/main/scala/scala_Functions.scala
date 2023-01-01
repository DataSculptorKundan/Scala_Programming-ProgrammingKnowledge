object scala_Functions {
  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y
    }
    def square(x: Int) = x*x
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def substract(x: Int, y: Int) : Int = {
    x - y
  }

  def mult(x: Int, y: Int) : Int = x * y

  def divide(x: Int, y: Int) = x / y

  def main(args: Array[String]): Unit = {
    println("Addition : " + add(25,85))
    println("Subtraction : " + substract(85,25))
    println("Multiplication : " + mult(25,5))
    println("Division : " + divide(90,10))
    println("Addition Math object : " + Math.add(25,85))
    println(Math square 7)
  }

}
