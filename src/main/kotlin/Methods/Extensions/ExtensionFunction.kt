fun main() {

    var s: String = "I am peyman asadi"
    println(s.spaceToCammel())
    println(s)
}
fun String.spaceToCammel():String{
    val sb=  StringBuilder();
    var shouldUpper = false

    for(x in this.withIndex()){
        if(x.value .equals(' ') && x.index+1 < this.length)
            shouldUpper = true
        else
            sb.append(if(shouldUpper) x.value.uppercase() else x.value).also { shouldUpper=false }
    }
    return  sb.toString()
}