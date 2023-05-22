class People(var name:String, var age:Int, var jobstatus:String, var gender:String){

}
fun main(){
    var person1=People("Rita",18,"Unemployed","Female")

    var person2=People("David",43,"Unemployed","Male")

    println(person1.name+ " "+person1.age+ " "+ person1.jobstatus+ " "+person1.gender )
    println(person2.name+ " "+person2.age+ " "+ person2.jobstatus+ " "+person2.gender)

}