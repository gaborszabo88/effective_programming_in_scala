case class Recantgle(w: Int, h: Int):
  val area = w * h

case class Square(s: Int):
  val area = s * s

case class Circle(r: Int):
  val area = r * r * 3.14

object Main extends App {
  println("Hello, World!")
  println(Circle(2).area)
}
