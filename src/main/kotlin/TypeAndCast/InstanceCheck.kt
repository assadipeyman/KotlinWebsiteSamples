fun main(args: Array<String>) {

    val f:Foo  = Foo()
    val b:Bar = Bar()
    val s:String = ""
    println( check(f))
    println( check(b))
    println( check(s))
}

fun check(x: Any):String {
    when (x) {
        is Foo -> return "Foo";
        is Bar -> return "Bar";
    }
    return "any"
}

class Foo{

}
class Bar{

}