class car{
    var make:String = "UK"
    var model:String = "Benz"
    var color:String= "Blue"
    var driving:Int= 90

    fun drive(){
        println("Drive")
    }
    fun turn(){
        println("Turn")
    }
    fun stop(){
        println("Stop")
    }
}
fun main(){
    var cars=car()
    cars.drive()
    cars.turn()
    cars.stop()

    println(cars.make+ " "+ cars.model+ " "+ cars.color+ " "+ cars.driving)


}