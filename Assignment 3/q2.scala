object q2{
 def main(args: Array[String]){
 primeseq(10)
 
 
}

def primeseq(n:Int):Unit ={

if(prime(n)) println (n)
if(n>2)  primeseq(n-1)
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