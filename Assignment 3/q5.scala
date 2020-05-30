object q5{
 def main(args: Array[String]){


println(even(10))
}

def add(n:Int):Int= n match{
 
 case 0 => 0
case _ => add(n-2)+n 
}

def even(n:Int):Int= n%2 match{
case 0 =>add(n-2)
 
}





}