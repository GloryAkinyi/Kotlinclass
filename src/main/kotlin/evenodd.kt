import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter number:")
    var number=read.nextInt()

    if (number%2==0){
        println("NUmber is even")
    }
    else{
        println("Number is odd")
    }
}