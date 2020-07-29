package Assignment5

object Q4BankAccounts extends App {
  val acc1 = new Account("978545626V", 101, 50000)
  val acc2 = new Account("534586956V", 220, 250000)
  val acc3 = new Account("925585626V", 105, -2500)
  val acc4 = new Account("885886956V", 457, -7500)
  val acc5 = new Account("947565626V", 898, 85000)
  val acc6 = new Account("558696956V", 171, 180000)
  var b:List[Account]=List(acc1, acc2, acc3, acc4, acc5, acc6)

  //List of Accounts with negative balances
  val overdraft=b.filter(_.balance<0)

  //Total of all account balances
  val bal=b.map(x=>x.balance).reduce(_+_)

  println("\nList of all accounts with negative balances:")
  println(overdraft)

  println("\nTotal of balance of all bank accounts is :")
  println(bal)

  println("\nList of all accounts before adding interest:")
  println(b)
  //If balance is positive deposit interest is .05
  //If balance is negative overdraft interest is .1
  b.map(x=>if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
  println("\nList of all accounts after adding interest: ")
  println(b)
}

class Account(id: String, n: Int, b: Double) {
  val nic: String = id
  val accnumber: Int = n
  var balance: Double = b

  def transfer(toAcc: Account, cash: Double): Unit = {
    this.balance = this.balance - cash
    toAcc.balance = toAcc.balance + cash
  }

  override def toString = "[ " + nic + " : " + accnumber + " : " + balance + " ]"
}

