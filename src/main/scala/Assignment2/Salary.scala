package Assignment2

object Salary extends App {
  def basic(t:Int):Double=t*150.0 //normal hours
  def ot(t:Int):Double=t*75.0 //overtime hours
  def netSalary(normalH:Int,otH:Int):Double=basic(normalH)+ot(otH)  //salary without tax
  def takehomeSalary(normalH:Int,otH:Int,tax:Double):Double=netSalary(normalH,otH)*(1-tax)

  println(takehomeSalary(40,20,0.1))
}
