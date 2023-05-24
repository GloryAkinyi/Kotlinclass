import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter length:")
    var length=read.nextInt()
    println(length)

    println("Enter width:")
    var width=read.nextInt()
    println(width)

    var area=length*width
    println("THe area of a rectangle is $area")
}