package Assignment3

object Q4OddOrEven extends App{
  @scala.annotation.tailrec
  def detOddEven(n:Int):String={
    if(n==0) return "Even"
    if(n==1) "Odd"
    else detOddEven(n-2)
  }
  println(detOddEven(17))
  println(detOddEven(10))
}
