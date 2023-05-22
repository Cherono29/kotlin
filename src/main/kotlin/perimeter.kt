import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)

    println("Enter length:")
    var length= read.nextInt()

    println("Enter width:")
    var width= read.nextInt()

    var perimeter= 2 * (length + width)
    println("The perimeter of a rectangle is $perimeter")
}