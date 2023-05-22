open class shape{
    open fun area(){
        println("Find the Area")
    }
}
class circle:shape(){
    override fun area(){
        println("Find  the Area")
    }
}
class triangle:shape(){
    override fun area(){
        println("Triangle")
    }
}
class rectangles:shape(){
    override fun area(){
        println("Rectangle")
    }
}
fun main(){
    var s= shape()
    s.area()
    var c=circle()
    c.area()
    var t=triangle()
    t.area()
    var r=rectangles()
    r.area()
}