package Assignment5

object Q2Subtract extends App {
  val r1 = new Rational1(3,4)
  val r2 = new Rational1(5,8)
  val r3 = new Rational1(2,7)
  println(r1-r2-r3)
}

class Rational1(num:Int, den:Int){
  require(den>0, "denominator must be greater than 0")
  def this(num:Int)=this(num,1)
  val gcdND = gcd(num,den)
  def n = num/gcdND
  def d = den/gcdND

  //- operator overloaded for subtraction
  def -(r2:Rational1) = new Rational1(this.n*r2.d-r2.n*this.d,this.d*r2.d)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = n + "/" + d
}