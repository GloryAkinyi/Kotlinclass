class Person{
    //Properties/Variables/Data members/Attributes
    var name:String="Glory"
    var age:Int=31
    var location:String="Nairobi"
    var height:Double=6.1

    //Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }
}
fun main(){
    var teacher=Person()
    teacher.eat()
    println(teacher.name)

    println(teacher.name+" "+teacher.age.toString()+" "+teacher.location+" "+teacher.height.toString())
}