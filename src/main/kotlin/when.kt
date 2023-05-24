fun main(){
    var number=5

    var result=when (number){
        1->"One"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        else->"Invalid number"
    }
    println("Number is $result")
}
