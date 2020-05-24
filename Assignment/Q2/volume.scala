object volume{
 

 def main (args: Array[String]){
   println("Volume of sphere with radius 5 is ="+vol(5))

}


def vol(r:Double):Double={

   var v:Double=(4.0/3) * math.Pi* math.pow(r,3)
  
   return v

}

}

