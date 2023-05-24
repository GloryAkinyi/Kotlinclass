class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){

    fun speak(talk:String){
        println(talk)
    }
}
fun main(){
    var Dog1=Dog("Tito","chiwawa","black",5,12)

    var Dog2=Dog("Billy","kienyeji","white",4,23)

    println(Dog1.name)

    Dog1.speak("Barking")


}