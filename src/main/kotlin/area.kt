import java.util.Scanner

fun main(){
    var read=Scanner(System.`in`)


    println("Enter length:")
    var length = read.nextInt()


    println("Enter width:")
    var width = read.nextInt()
    


    var area = length * width
    println("The area is $area")


}