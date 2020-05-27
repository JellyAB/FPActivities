package Assignment3

object Q1Prime extends App {
  @scala.annotation.tailrec
  def isPrime(n:Int, i:Int):Boolean={
    if(i==1) true
    else{
      if(n%i==0) false
      else isPrime(n,i-1)
    }
  }
  var n:Int=5
  println(isPrime(n,n/2))
  n=8
  println(isPrime(n,n/2))
}