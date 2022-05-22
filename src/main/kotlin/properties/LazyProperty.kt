fun main(){
    var i:  Int = 1
    val p: String by lazy {
        "${++i}"
    }
    println(i)
    println(p)
    println(i)
}