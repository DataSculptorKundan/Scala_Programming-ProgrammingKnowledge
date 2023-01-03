/*
type      getter    setter
----      ------    ------
var         YES       YES
val         YES       NO
default     NO        NO

Auxiliary_Constructors -> Alternative constructor of class
 */

class User_y(var name: String, var age: Int) {
  def this() {
    this("Pihu",25)
  }

  def this (name: String){
    this(name,25)
  }
}

object scala_Auxiliary_Constructors {

  def main(args: Array[String]): Unit = {
    var userDetails1 = new User_y("Kundan",28)
    var userDetails2 = new User_y()
    var userDetails3 = new User_y("Kundan")

    println(userDetails1.name)
    println(userDetails2.name)
    println(userDetails3.name)
  }

}
