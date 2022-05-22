fun main(){

val obj:MyObject = MyObject().apply {
    prop1=1
    prop2=2
}
    println(obj)
}

class MyObject{
    var prop1:Int? = null
    var prop2:Int? = null
    override fun toString(): String {
        return "{prop1:$prop1 , prop2:$prop2}"
    }
}
