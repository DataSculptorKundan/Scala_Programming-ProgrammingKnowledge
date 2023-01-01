object match_expression {
  def main(args: Array[String]): Unit = {
    val age = 25
    age match {
      case 20 => println(age)
      case 52 => println(age)
      case 25 => println(age)
      case _ => println("default")
    }

    val result = age match {
      case 20 => age
      case 52 => age
      case 25 => age
      case _ => "default"
    }
    println("Result : " + result)


    val name = "Kundan"
    val name_result = name match {
      case "Kundan" => name
      case "Raju" => name
      case "Kamal" => name
      case _ => "Name not found"
    }
    println("Entered name is : " + name_result)


    val numberOddEven = 8
    numberOddEven match {
      case 2 | 4 | 6 | 8 | 0 => println("Even")
      case 1 | 3 | 5 | 7 | 9 => println("Odd")
    }
  }
}
