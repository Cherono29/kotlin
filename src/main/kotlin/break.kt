fun main(){
    var number=1

    while (number<=6){
        println(number)
        number++

        if (number==4){
            break
        }
    }
    var no=30

    while (no >= 25){
        println(no)
        no--

        if (no==28){
            break
        }
    }
    var counter=5

    while (counter <= 10){
        if (counter==8)  {
            counter++
            continue
        }
        println(counter)
        counter++

    }

}