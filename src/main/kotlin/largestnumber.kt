import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)

    println("Enter firstnumber:")
    var fnumber=read.nextDouble()
    println(fnumber)

    println("Enter secondnumber:")
    var snumber=read.nextDouble()
    println(snumber)

    println("Enter thirdnumber:")
    var tnumber=read.nextDouble()
    println(tnumber)

    if (fnumber>snumber && fnumber>tnumber){
        println("$fnumber is the greatest")
    }
    else if (snumber>fnumber && snumber>tnumber){
        println("$snumber is the greatest")
    }
    else{
        println("$tnumber is the greatest")
    }



}