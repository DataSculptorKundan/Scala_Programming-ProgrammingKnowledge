import java.util.Date


object partially_applied_functions {
  def log(date: Date, message: String) ={
    println(date + "  " + message)
  }


  def main(args: Array[String]) ={
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10,20,_: Int)
    val fa = sum(10, _: Int, _: Int)
    println(f(200))
    println(fa(200,50))

    val dT = new Date
    val newLog = log(dT, _: String)

    newLog("The message 1")
    newLog("The message 2")
    newLog("The message 3")
    newLog("The message 4")
  }

}
