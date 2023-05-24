class Car{
    var make="Kenyan"
    var model="Toyota"
    var color="white"
    var drivingSpeed=80

    fun drive(){
        println("Driving")
    }
    fun turn(){
        println("Turning")
    }
    fun stop(){
        println("Stoping")
    }
}

fun main(){
    var car1=Car()
    println(car1.color)

    car1.stop()
}