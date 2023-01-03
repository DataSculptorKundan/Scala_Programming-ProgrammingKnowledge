package Inheritance

class Polygon {
  def area: Double = 0.0
}

object Polygon {
  def main(args: Array[String]): Unit = {
    val poly = new Polygon
    val rect = new Rectangle(55.2, 35.0)
    val tri = new Triangle(25.06, 16.03)
    printArea(poly)
    printArea(rect)
    printArea(tri)
  }

  def printArea(p: Polygon): Unit = {
    println(p.area)
  }
}