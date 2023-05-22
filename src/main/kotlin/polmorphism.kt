//Parent class
open class Shape{
    open fun draw(){
        println("Drawing")
    }
}
//Child class
class rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}
class Square:Shape(){
    override fun draw(){
        println("Drawing")
    }
}
fun main(){
    var r=rectangle()
    r.draw()
    var s=Square()
    s.draw()
}