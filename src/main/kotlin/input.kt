import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter your name:")
    var name= readln()
    println("My name is $name")

    println("Enter your age:")
    var age=read.nextInt()
    println("I am $age years old")

    println("Enter a float:")
    var number=read.nextFloat()
    println("The number entered is $number")

}