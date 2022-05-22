fun main(){
    println(theAnswer())

    println(transformNumber(3))
    try {
        println(transformNumber(6))
    }catch (ex:Exception){
        println(ex.toString())
    }
}

fun theAnswer() = 42

fun transformNumber(number : Int): String = when(number){
    1->"One"
    2->"Two"
    3->"Three"
    4->"Four"
    5->"Five"
    else -> throw java.lang.IllegalArgumentException("Nuber should be in range 1 <= .. <= 5")


}