import com.google.gson.Gson

fun main(args: Array<String>) {
    val g: Gson = Gson();
    val a= A("1")
    println( g.toJson(a))
}

class A(var name:String) {
}
