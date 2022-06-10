import com.google.gson.Gson
import kotlin.random.Random

fun main(args: Array<String>) {
    val p1 = Person("Payman" , 39)
    val p2 = Person("Payman" , 39)
    val p3 = Person("payman" , 39)

    println("${p1.hashCode()}")
    println("${p2.hashCode()}")
    println("${p3.hashCode()}")
    println(p1==p2)
    println(p1==p3)

}

data class Person(val name:String , val age:Int){
    override fun equals(other: Any?): Boolean {
        if (other != null && other is Person) {
            return other.name.equals(this.name , true) && other.age.equals(age)
        }
        return false
    }
}