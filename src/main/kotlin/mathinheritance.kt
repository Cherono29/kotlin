open class Figure{
    var Start:String="Start"

    fun area(){
        println("This is the area")
    }
    fun perimeter(){
        println("This is the perimeter")
    }
    fun draw(){
        println("Drawing")
    }
}
class Circle:Figure(){
    var radius:String="Radius"

    fun Area(){
        println("Area")
    }
    fun Perimeter(){
        println("Perimeter")
    }
    fun Draw(){
        println("Draw")
    }
}
open class Rectangle{
    var width:String="Width"
    var height:String="Height"

    fun ar(){
        println("Area")
    }
    fun per(){
        println("Perimeter")
    }
    fun dr(){
        println("Draw")
    }
}
fun main(){
    var c= Circle()
    println(c.radius)
    c.Draw()
    var r= Rectangle()
    println(r.height)
    r.per()
    var f= Figure()
    println(f.Start)
    f.perimeter()
}