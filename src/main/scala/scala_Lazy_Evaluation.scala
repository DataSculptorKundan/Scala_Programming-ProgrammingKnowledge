class strict {
  val e = {
    println("Strict")
    9
  }
}
class lazyEval {
  lazy val l = {
    println("Lazy Eval")
    9
  }
}

object scala_Lazy_Evaluation {
  def main(args: Array[String]): Unit = {
    val x = new strict
    val y = new lazyEval

    println(x.e)
    println(y.l)
  }

}
