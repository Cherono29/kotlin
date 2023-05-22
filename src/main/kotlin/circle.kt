import java.util.Scanner

fun main(){
     var read=Scanner(System.`in`)

     var pi=3.142

     println("Enter radius:")
     var radius =read.nextInt()

    var area = pi * radius * radius
    println("The area of the circle is $area")
    var x=area.toInt()
    println(x)
}