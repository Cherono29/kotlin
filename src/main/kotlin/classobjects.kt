class Person{
    //Properties/Variables/Data members/Attributes
    var name:String= "Vicky"
    var age:Int= 18
    var location:String= "Nairobi"
    var height:Double= 5.5

    //Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }
}
fun main(){
    var teacher=Person()
    teacher.eat()
    println(teacher.name + " "+ teacher.age+ " "+ teacher.location+ " "+ teacher.height)

}