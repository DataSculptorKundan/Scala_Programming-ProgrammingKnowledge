package Inheritance

class Triangle(var base: Double, var height: Double) extends Polygon {
  override def area: Double = base * height / 2

}
