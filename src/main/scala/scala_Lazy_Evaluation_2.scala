object scala_Lazy_Evaluation_2 {

  def method1(n: Int): Unit = {
    println("Inside Method 1")
    println("Value of n : " + n)
  }
  def method2(n: => Int): Unit = {  // call by name parameter method (n: => Int) then first print "Inside method 2"
    println("Inside Method 2")
    println("Value of n : " + n)
  }

  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => {
      println("Addition")
      a + b
    }

    method1(add(10,20))
    method2(add(30,40))

  }


}
