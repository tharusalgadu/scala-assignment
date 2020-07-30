package MyPackage.scala

object Myapp extends App {
  val x=new Rational(3,4)
  val y=new Rational(5,8)
  val z=new Rational(2,7)
  val p=x.neg
  val q=x.sub(y).sub(z)
  println("x="+x)
  println("y="+y)
  println("-x="+p)
  println("x-y-z="+q)
}

class Rational(n:Int,d:Int){


  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  override def toString=numer+"/"+denom
  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
  def neg = new Rational(-this.numer,this.denom)
  def add(r: Rational) = new Rational(this.numer * r.denom + this.denom * r.numer, this.denom * r.denom)

  def sub(r: Rational) = this.add(r.neg)


}
