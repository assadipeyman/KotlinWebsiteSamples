fun main(){
    val arr =arrayOfMinusOnes(10)
    println( arr.joinToString())
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}
