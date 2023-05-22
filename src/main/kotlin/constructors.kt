class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){

    fun speak(talk:String){
        println(talk)
    }

}
fun main(){
    var Dog1=Dog("Sam","German shepherd","black",7,15)

    var Dog2=Dog("Art","chihuahua","white",4,10)

    println(Dog1.name)

    Dog1.speak("Barking")
}