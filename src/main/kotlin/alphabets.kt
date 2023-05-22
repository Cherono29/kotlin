import java.util.Scanner

fun main(){
    var reader=Scanner(System.`in`)

    println("Enter alphabet:")
    var alphabet= reader.next().single()

    if (alphabet=='a' || alphabet=='e'|| alphabet=='i' || alphabet=='o' || alphabet=='u'){
        println("$alphabet is a vowel")
    }
    else{
        println("$alphabet is a consonant")
    }


}