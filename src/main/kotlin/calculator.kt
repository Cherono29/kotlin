import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var first = read.nextFloat()

    println("Enter Operator: ")
    var operator = read.next()

    println("Enter second number:")
    var second = read.nextFloat()


    var result  = when(operator){
        "+" -> first  + second
        "-" -> first  - second
        "*" -> first  * second
        "/" -> first / second
        else -> {"error"}
    }
    println(result)
}