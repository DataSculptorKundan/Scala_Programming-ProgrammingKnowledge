object scala_Strings {
  val str1 = "Hello world"
  val str2 = " Kundan"
  val num1 = 45
  val num2 = 52.65f


  def main(args: Array[String]) ={
    println(str1.length())
    println((str1).concat(str2))
    println(str1 + str2)

    val result = printf("(%d -- %f -- %s)",num1,num2,str1)
    println(result) // (45 -- 52.650002 -- Hello world)()

    println("%d -- %f -- %s".format(num1,num2,str2))  // 45 -- 52.650002 --  Kundan

    printf("(%d -- %f -- %s)",num1,num2,str2) // (45 -- 52.650002 --  Kundan)
  }

}
