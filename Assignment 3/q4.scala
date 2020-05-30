object q4{
 def main(args: Array[String]){

println(evenOdd(4))
println(evenOdd(11))


}

def  evenOdd(n:Int):String = n%2 match{

case 0=>"even"
case 1=>"odd"
}










}