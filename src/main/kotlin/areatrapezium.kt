import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter a:")
    var a=read.nextInt()
    println(a)

    println("Enter b:")
    var b=read.nextInt()
    println(b)

    println("Enter height:")
    var height=read.nextInt()
    println(height)

    var area=((a+b)/2)*height
    println("The area of the trapezium is $area")

}