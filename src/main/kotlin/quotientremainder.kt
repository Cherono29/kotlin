import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var Firstnumber= read.nextInt()

    println("Enter second number:")
    var Secondnumber= read.nextInt()

    var quotient= Firstnumber/Secondnumber
    println("The quotient is $quotient")

    var remainder= Firstnumber%Secondnumber
    println("The remainder is $remainder")
}