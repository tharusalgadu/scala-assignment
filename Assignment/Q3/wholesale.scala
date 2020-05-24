object wholesale{
  
def main (args: Array[String]){
    println("Wholesale Cost is :"+wsc(60))
}


def wsc(n:Int):Double={
var total_cover_price:Double=24.95*(60.0/100)*n
var shipping_cost:Double=0
var tot_cost:Double=0

if(n<=50)
shipping_cost=3

else
shipping_cost=3+(n-50)*0.75


tot_cost=total_cover_price + shipping_cost


return tot_cost
 


}
}


