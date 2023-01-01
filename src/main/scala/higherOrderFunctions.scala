object higherOrderFunctions {
  def math(x: Int, y: Int, f: (Int, Int) => Int): Int = f(x, y)

  def math_I(x: Double, y: Double, z: Double, f: (Double, Double)=> Double): Double = f(f(x, y),z)


  def main(args: Array[String]) = {
    val result = math(52,36,(x,y)=>x+y)
    println(result)
    println(math(52,36,(x,y)=>x min y))
    println(math(52,36,(x,y)=>x max y))

    val result_I = math_I(58,20,10,(x,y)=>x+y)
    println(result_I)
    println(math_I(58,20,10,_*_))
    println(math_I(58,20,10,_ min _))
    println(math_I(58,20,10,_ max _))
  }

}
