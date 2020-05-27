package Assignment3
import Q1Prime.isPrime

object Q2PrimeSeq extends App {

  @scala.annotation.tailrec
  def seqPrime(n: Int): Unit= {
    if(n==0||n==1){
      return
    }
    if(isPrime(n,n/2)) println(n)
    seqPrime(n-1)
  }
  seqPrime(10)
}