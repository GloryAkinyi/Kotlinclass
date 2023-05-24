import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter firstnumber :")
     var firstnumber=read.nextFloat()

    println("Enter secondnumber:")
    var secondnumber=read.nextFloat()

    var result=firstnumber/secondnumber
    println(result)

    var rem=firstnumber%secondnumber
    println(rem)
}