fun main(args: Array<String>) {

    val highScores = listOf(4000, 2000, 10200, 12000, 9030)

    println(".withIndex")
    for( k in  highScores.withIndex())
        println("${k.index} -> ${k.value}" )

    println(".forEachIndexed")
    highScores.forEachIndexed { index, i -> println("${index} -> ${i}" ) }

}
