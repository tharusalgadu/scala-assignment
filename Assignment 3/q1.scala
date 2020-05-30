object q1{
 def main(args: Array[String]){

printf("5 is prime :"+ prime(5))
printf("\n")
printf("8 is prime :"+ prime(8))




}


def prime(p:Int,n:Int=2):Boolean=n match{
 case n if (n==p)=> true
 case n if GCD(p,n)>1 => false
 case n => prime(p,n+1)
}

def GCD(a:Int, b:Int) : Int= b match{
case 0=>a
case b if b>a =>GCD(b,a)
case b=>GCD(b,a%b)
}















}