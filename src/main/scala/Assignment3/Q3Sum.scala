package Assignment3

object Q3Sum extends App{
  @scala.annotation.tailrec
  def printSum(n:Int, sum:Int):Int={
    if(n==0) return sum
    printSum(n-1,n+sum)
  }
  println(printSum(5,0))
}
