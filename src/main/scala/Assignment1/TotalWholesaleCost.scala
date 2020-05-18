package Assignment1

object TotalWholesaleCost extends App{
  def netCost(x:Int)=x*24.95*0.6
  def shipCost(x:Int): Double ={
    if(x<=50){  //copies less than or equal to 50
      x*3
    }else{  //copies more than 50
      50*3 + 0.75*(x-50)
    }
  }
  def wholeCost(x:Int)=netCost(x:Int)+shipCost(x:Int)
  println(wholeCost(60))

}
