fun main(){
    Employee("Glory",105000, false)
    Employee("Maina",65000, true)
    Employee("Grace",7800, true)
    Employee("Job",95000, false)

}

fun Employee(name:String, salary:Int,disability:Boolean){
    println("$name is earning $salary")
}