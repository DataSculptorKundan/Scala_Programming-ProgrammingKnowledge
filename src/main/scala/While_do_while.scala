object While_do_while {
  def main(args: Array[String]): Unit = {
    var intNumber = 1
    while(intNumber <= 10){
      println("intNumber = " + intNumber)
      intNumber += 1 // intNumber = intNumber + 1
    }


    intNumber = 1
    do {
      println("intNumber_do = " + intNumber)
      intNumber += 1 // intNumber = intNumber + 1
    } while(intNumber <= 5)


    intNumber = 77
    do{
      println("IntNumber_do_exit = " + intNumber)
      intNumber += 1
    } while (intNumber > 100)
  }
}
