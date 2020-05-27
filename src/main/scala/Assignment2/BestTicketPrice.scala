package Assignment2

object BestTicketPrice extends App {
  def attendees(p:Int)=120+(15-p)/5*20
  def revenue(p:Int)=attendees(p)*p
  def cost(p:Int)=500+3*attendees(p)
  def profit(p:Int)=revenue(p)-cost(p)

  var p:Int=0
  var profitArray = new Array[Int](50)
  while(p<50){
    profitArray(p)= profit(p)
    p=p+1
  }
  //profit array
  //println(profitArray.mkString(" "))

  //println(profitArray.max)  // maximum profit of profit array
  println("Best ticket price is : "+ profitArray.indexOf(profitArray.max))  //index of max profit element

}
