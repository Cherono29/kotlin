import java.util.Scanner
fun main(){
    var read = Scanner(System.`in`)

    println("Enter number:")
    var number = read.nextFloat()

    if (number>0){
        println("$number is positive")
    }
    else  if (number<0){
        println("$number is negative")
    }
    else {
        println("0 is neutral")
    }
}