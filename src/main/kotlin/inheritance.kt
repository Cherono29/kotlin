//Parent class/Super class/Base class
open class animal{
    var age:Int=12
    var gender:String="Fish"

    fun isMammal(){
        println("Animal is a mammal")
    }
}
//Child class/Sub-classes/Derived classes
class Duck:animal(){
    var color="White"
    fun swim(){
        println("Swimming")
    }
}
class Fish:animal(){
    var canEat=true
    fun swim(){
        println("Swimming")
    }
}
class Horse:animal(){
    var isWild=true
    fun run(){
        println("Running")
    }
}
fun main(){
    var d=Duck()
    println(d.color)
    var f=Fish()
    f.swim()
    var h=Horse()

}
