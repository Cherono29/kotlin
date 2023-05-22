import java.util.Scanner

fun  main(){
    var read = Scanner(System.`in`)

    println("Enter a:")
    var a=read.nextInt()

    println("Enter b:")
    var b=read.nextInt()

    println("Enter height:")
    var h=read.nextInt()

    var area= ((a+b)/2) * h
    println("The ara of the trapezium is $area")

}