object q3{
 def main(args: Array[String]){
 println("Total is:"+ add(5))

}


def add(n:Int):Int= n match{
 
 case 0 => 0
case _ => add(n-1)+n 
 


}





}