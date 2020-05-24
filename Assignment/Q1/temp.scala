object temp{
  def main (args: Array[String]){

println("Fahrenheit value of 35 celsius is="+ C_into_F(35))
}


  def C_into_F(c:Double):Double={

var f:Double=c*1.8000+32.00
return f
}


}