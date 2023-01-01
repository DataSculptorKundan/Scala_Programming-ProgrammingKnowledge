object scala_Functions_II {

  object Math {
    def add(x: Int = 85, y: Int = 63): Int = {  // assigned default value for functions
      x + y
    }
    def square(x: Int) = x * x
  }

  object Math_I {
    def +(x: Int, y: Int): Int = { // assigned default value for functions and + operator treat as function name here.
      x + y
    }

    def **(x: Int) = x * x   // * operator treat as function name here.
  }

  def print(x: Int, y: Int) : Unit = {  //doesn't return anything, used : Unit
    println(x+y)
  }

  val add = (x: Int, y: Int) => x + y   // Anonymous Functions in Scala.
  println(add(100,300))

  def main(args: Array[String]) ={
    println(Math.add(20,85))
    println(Math square(7))
    println(Math_I +(5,9))
    println(Math_I **(3))
    print(25,20)
  }

}
