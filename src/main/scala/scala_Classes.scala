// var -> getter and setter will be available.
// val -> getter will be available but not setter.
// default -> not getter neither setter will be available.

class User(var name: String, var age: Int)

class User2(private var name2: String, var age2: Int) {
  def printUserDetails { println(name2)}  // If you assigned private --> Only can user inside the class.
}

object scala_Classes {

  def main(args: Array[String]) = {
    var user = new User("Kundan", 28)
    println(user.name)
    println(user.age)

    user.name = "Raju"
    user.age = 27

    println(user.name)
    println(user.age)

    var user2 = new User2("Rahim",25)
    user2.printUserDetails
    println(user2.age2)
  }

}
