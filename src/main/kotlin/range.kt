fun main(){
    for (number in 1..5){
        println("Number : $number")
    }

    for (letter in 'a'..'f'){
        println("letter is $letter")
    }

    for (num in 10..15){
        if (num==13){
            break
        }
        println(num)
    }


    for (num in 10..15){
        if (num==12){
            continue
        }
        println(num)
    }


    for (myletter in 'a'..'d'){
        if (myletter=='c'){
            continue
        }
        println(myletter)
    }



}