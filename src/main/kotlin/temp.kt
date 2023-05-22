import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter temperature:")
    var temperature = read.nextFloat()

    if (temperature<37){
        println("It is too cold")
    }
    else if (temperature>37){
        println("It is too hot")
    }
    else{
        println("Normal temperature")
    }
}