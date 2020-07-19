object caesar_cipher{
def main(args: Array[String]) {

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


val Encry=(c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)+key+a.size)%a.size)  

val Decry=(c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)-key+a.size)%a.size) 



val Cipher=(algo:(Char,Int,String) => Char,s:String,key:Int,a:String) => s.map(algo(_,key,a))

val eMg=Cipher(Encry,"ABCD",4,alphabet)
val dMg=Cipher(Decry,"EFGH",4,alphabet)

println(eMg)
println(dMg)

}



}