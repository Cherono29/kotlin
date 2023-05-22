fun main(){
  employee("Maxwell", "Swedish", 100000, "Married", false,"director", 5467)
  employee("Leslie", "Kenyan", 70000, "Single", false,"manager", 1030)
  employee("Kyle", "Australian", 50000, "Married", false,"secretary", 1245)
  employee("Sam", "Kenyan", 45000, "Married", true,"receptionist", 1160)
  employee("Keziah", "Tanzanian", 30000, "Single", false,"chef", 7895)
}
fun employee(firstname:String, citizenship:String, salary:Int, status:String, disability:Boolean, position:String, id:Int ){
    println("The employee's names are $firstname"+ "."+ "They are $citizenship" + "."+ "Their salary is $salary"+ "."+ "Disability->$disability"+ "."+"Their position is a $position"+ "."+ "Their id is $id")


}