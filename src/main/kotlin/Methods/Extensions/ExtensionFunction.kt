fun main(){
    fun String.spaceToCamelCase():String {
        var s:String = this;
       for(ch:Char in 'a'..'z')
          s= s.replace(" $ch",ch.uppercase())
        for(ch:Char in 'A'..'Z')
            s= s.replace(" $ch",ch.toString())
        return s;
    }

    var s:String = "I am peyman asadi"
    println(s.spaceToCamelCase())
    println(s)
}