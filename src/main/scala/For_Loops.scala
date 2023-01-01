object For_Loops {
  def main(args: Array[String]): Unit = {
    for (iterateNumber <- 1 to 5) {
      println("Iteration is " + iterateNumber)
    }

    for (iterateNumber <- 1.to(5)) {
      println("Iteration is " + iterateNumber)
    }

    for (iterateNumber <- 1 until (6)) {
      println("Iteration_Until is " + iterateNumber)
    }

    for (iterateNumber <- 1.until(3)) {
      println("Iteration_Until is " + iterateNumber)
    }

    for (iterateNumber <- 1 to 5; iterateNumber_2 <- 1 to 3) {
      println("Using multiple loop(i,j) : " + iterateNumber + " " + iterateNumber_2)
    }

    val lst = List(1, 4, 5, 6, 8, 9, 5, 6, 8, 9, 6, 7, 8, 9, 9, 0)
    for (iterateNumber <- lst) {
      println("List value is : " + iterateNumber)
    }

    for (iterateNumber <- lst; if iterateNumber <= 6) {
      println("Filter List value is : " + iterateNumber)
    }

    val result = for { iterateValue <- 1 to 5 } yield {
      iterateValue * iterateValue
      }
    println("result " + result)
  }
}
