object CaseClass extends App {
  val p1=Point(2,4)
  val p2=Point(4,8)
  val p3=p1.move(2,2)
  val p4=p1.distance(p2)
  val p5=p2.invert()

  println("p1 is :  "+p1)
  println("p2 is :  "+p2)
  println("(p1+p2) is :  "+(p1+p2))
  println("move p1 by (2,2):"+p3)
  println("distance between p1 & p2 is:"+p4)
  println("invert of p2 is:"+p5)



}


case class Point(x:Int,y:Int) {
  def +(that: Point) = Point(this.x + that.x, this.y + that.y)

  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  def invert() = Point(this.y, this.x)
  def distance(a:Point)=scala.math.sqrt(scala.math.pow(a.x -this.x , 2) + scala.math.pow(a.y -this.y, 2))
}
