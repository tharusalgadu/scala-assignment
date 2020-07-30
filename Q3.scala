package MyPackage.scala

object MyNewApp extends App{
  var a1=new Account("2468v",322774,24000)
  var a2=new Account("2464v",322772,10000)


  println("before transfer a1="+a1)
  println("before transfer a2="+a2)
  a1.transfer(a2,4000)
  println("after transfer a1="+a1)
  println("after transfer a2="+a2)


  var bank:List[Account]=List()
}
class Account(id:String,n: Int, b: Double){
  val nic:String=id
  val acnumber:Int=n
  var balance:Double=b




  def transfer(a:Account,b:Double) {
    this.balance=this.balance-b
    a.balance = a.balance + b
  }


  override def toString =
    "["+nic+":"+acnumber +":"+ balance+"]"
}



