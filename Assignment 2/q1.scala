object q1{

 def main (args: Array[String]){

printf("Take Home Salary is "+takehome(40,20) )



}

def takehome(N:Int,O:Int):Double = income(N,O)-tax(income(N,O))

def income(N:Int, O:Int):Int= normal(N)+ot(O)

def tax(income:Int):Double=income*.1

def normal(N:Int):Int= N*150

def ot(O:Int):Int=O*75



}