package Assignment3

object Q5SumEven extends App{
  @scala.annotation.tailrec
  def printSumEven(n:Int, sum:Int):Int={
    if(n==0){
      return sum
    }
    if(n%2==0){
      printSumEven(n-1,n+sum)
    }
    else printSumEven(n-1,sum)

  }
  var n:Int=10
  println(printSumEven(n-1,0))

}
