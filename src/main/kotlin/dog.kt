class Animal(var breed:String, var size:String, var age:Int, var color:String){
    fun Eat(){
        println("Eat")
    }
    fun Sleep(){
        println("Sleep")
    }
    fun Sit(){
        println("Sit")
    }
    fun Run(){
        println("Run")
    }
}
fun main(){
    var Dog1=Animal("Neopolitan Mastiff","Large",5,"Black")

    var Dog2=Animal("Maltese","Small",2,"White")

    var Dog3=Animal("Chow Chow","Medium",3,"Brown")

    println(Dog1.breed)
    println(Dog2.breed)
    println(Dog3.breed)            
}