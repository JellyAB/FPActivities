package Assignment3

object Q6Fibonacci extends App {
  def fibo(n:Int):Int={   //get the n th fibonacci number
    if(n==0) return 0
    if(n==1) 1
    else fibo(n-1)+fibo(n-2)
  }

  def printFibo(n:Int){   //print all fibonacci numbers upto n
    var i:Int=0
    while(i < n){
      print(fibo(i)+" ")
      i=i+1
    }
    println()
  }
  printFibo(10)
}
