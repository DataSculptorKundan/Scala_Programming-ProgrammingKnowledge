package Inheritance

class Rectangle (var width: Double, var length: Double) extends Polygon {
  override def area: Double = width * length

}
