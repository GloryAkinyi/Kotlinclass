//Parent class/Super class/Base class
open class Animal{
    var age=12
    var gender="Female"

    fun isMammal(){
        println("Animal is a mammal")
    }
}
//Child classes/Sub classes/Derived classes
class Duck:Animal(){
    var color="White"
    fun swim(){
        println("Swimming")
    }
}
class Fish:Animal(){
    var canEat=true
    fun swim(){
        println("Swimming")
    }
}
class Horse:Animal(){
    var isWild=false
    fun run(){
        println("Running")
    }
}
fun main(){
    var d=Duck()
    println(d.color)

    var f=Fish()
    f.swim()

    var h=Horse()
}