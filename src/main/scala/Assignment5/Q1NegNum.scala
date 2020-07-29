package Assignment5

object Q1NegNum extends App {
  var r1 = new Rational(3,4)
  println(r1.neg)
}

class Rational(num:Int, den:Int){
  require(den>0, "denominator must be greater than 0")
  val gcdND = gcd(num,den)
  def n = num/gcdND
  def d = den/gcdND
  def this(num:Int)=this(num,1)

  def neg = new Rational(-this.n,this.d)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = n + "/" + d
}