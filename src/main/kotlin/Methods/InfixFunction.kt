fun main() {
    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(3 times "Bye ")                                   // 2
}

