object q6{
 def main(args: Array[String]){

fibseq(4)


}



def fibonacci(n:Int):Int= n match{

case x if x==0 => 0
case x if x==1=> 1
case x => fibonacci(n-1)+fibonacci(n-2)

}

def fibseq(n:Int) : Unit ={

if (n>0) fibseq(n-1)
println(fibonacci(n))



}








}