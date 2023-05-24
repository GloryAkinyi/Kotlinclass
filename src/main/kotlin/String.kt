fun main(){
    var text="Hello world"
    var firstname="Glory"
    var lastname="eMobilis"

    println(firstname+" "+lastname) //Concatenation
    println(firstname.plus(lastname))

    println(text[0])
    println(text.toUpperCase())
    println(text.toLowerCase())
    println(text.indexOf("world"))
    println("Hello there, my name is $firstname") //String interpolation
}