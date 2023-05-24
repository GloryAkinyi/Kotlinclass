//Parent class
open class Shape{
    open fun draw(){
        println("Drawing")
    }
}
//Child class
class Rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}
class Square:Shape(){
    override fun draw(){
        println("Draw a square")
    }

}
fun main(){
    var r=Rectangle()
    r.draw()

    var s=Square()
    s.draw()
}
