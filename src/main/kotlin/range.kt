fun main(){
     for (number in 1..25){
         println(number)
     }
     for (letter in 'a'..'f'){
         println("letter is $letter")
     }
    for (number in 10..15){
        if (number == 13){

            break
        }
        println(number)
    }
    for (num in 10..15){
        if (num == 12){
            continue
        }
        println(num)
    }
    for (myletter in 'a'..'d'){
        if (myletter=='c'){
            break
        }
        println(myletter)
    }
}