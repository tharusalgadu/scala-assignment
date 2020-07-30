package assignment5.scala

import MyPackage.scala.Rational

object q4 extends App {
  var Accounts : List [Account] = List()
  Accounts = Accounts :+new Account ("12v",22, 422)
  Accounts = Accounts :+new Account ("34v",44, -150)
  Accounts = Accounts :+new Account ("56v",55, 400)
  Accounts = Accounts :+new Account ("78v",66, 800)
  Accounts = Accounts :+new Account ("87v",33, -200)


  val overdraft = (accList:List[Account])=> accList.filter(p=> p.balance<0)
  println("\nQ4.1)  List of all negative balance accounts")
  println(overdraft(Accounts))
}

class Account(id:String,n: Int, b: Double){
  val nic:String=id
  val acnumber:Int=n
  var balance:Double=b


  override def toString =
    "["+nic+":"+acnumber +":"+ balance+"]"
}


