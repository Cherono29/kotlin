import java.util.Scanner
fun main(){
    //Predefined functions
    println("Hello world")

    var squareroot=Math.sqrt(256.0)
    println(squareroot)

    var roundoff=Math.round(34.56)
    println(roundoff)

    var number=Math.ceil(45.67)
    println(number)

    myFun()
    addition()
    details("Vicky",18)
    details("Sam", 19)
    details("Sheila", 17)
}
//User-defined functions
fun myFun(){
    println("Today is Friday")
}

fun addition(){
    var num1= 20
    var num2= 40

    println(num1+num2)

}
fun details(name:String, age:Int){
    println("$name is $age years old")
}
