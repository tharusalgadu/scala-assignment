object q2{

 def main (args: Array[String]){
printf("Profit when ticket is 5:-"+profit(5))
printf("\n")
printf("Profit when ticket is 10:-"+profit(10))
printf("\n")
printf("Profit when ticket is 15:-"+profit(15))
printf("\n")
printf("Profit when ticket is 20:-"+profit(20))
printf("\n")
printf("Profit when ticket is 25:-"+profit(25))
printf("\n")
printf("Profit when ticket is 30:-"+profit(30))
printf("\n")
printf("Profit when ticket is 35:-"+profit(35))
printf("\n")

printf("Therefore the highest profit make in price 25 rupees.")
}


def profit(price:Int):Int=income(price)-cost(price)
def income(price:Int):Int=price*attendees(price)
def attendees(price:Int):Int=120+(15-price)*4
def cost(price:Int):Int=500+3*attendees(price)






}