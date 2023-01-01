object String_Interpolation {
  def main(args: Array[String]): Unit = {
    val name = "Kundan"
    val age = 28
    println(name + " is " + age + " years old.")
    println(s"$name is $age years old.")
    println(f"$name is $age years old.")
    println(f"$name%s is $age%d years old.")
    println(s"Hello \nWorld. ")
    println(raw"Hello \n World.")
  }

}
