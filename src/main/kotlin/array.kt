fun main(){
    var language= arrayOf("Python","Javascript","Kotlin")
    language[2]="c++"
    println(language[2])

    var lang=language.plus("Laravel")
    for (x in lang){
        println(x)
    }

    println(language.size)
    println(lang.size)
}