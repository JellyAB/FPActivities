package Assignment5

object Q3Account extends App {
  val acc1 = new Account1("978545626V", 101, 50000)
  val acc2 = new Account1("534586956V", 220, 120000)
  println("Initial account details :")
  println(acc1)
  println(acc2)
  acc1.transfer(acc2,25000)
  println("After first account transfers 25000 to second account :")
  println(acc1)
  println(acc2)
}

class Account1(id: String, n: Int, b: Double) {
  val nic: String = id
  val accnumber: Int = n
  var balance: Double = b

  def transfer(toAcc: Account1, cash: Double): Unit = {
    this.balance = this.balance - cash
    toAcc.balance = toAcc.balance + cash
  }
  override def toString = "[ " + nic + " : " + accnumber + " : " + balance + " ]"
}