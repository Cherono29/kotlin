fun main(){
    var language= arrayOf("Python","Javascript","Kotlin")
    language[2]="c++"

    var lang=language.plus("Laravel")
    for (x in lang){
        println(x)
    }
    println(language.size)
    println(lang.get(2))

}