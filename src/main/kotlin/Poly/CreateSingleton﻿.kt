fun main() {
    var res1: Resource = Resource
    var res2: Resource = Resource
    println("res1: ${res1.toString()}")
    println("res2: ${res2.toString()}")

    println("Resource: ${Resource.name}")

    res1.name= "name changed"
    println("res1: ${res1.toString()}")
    println("res2: ${res2.toString()}")

    println("Resource: ${Resource.name}")
}

//This class is object so this is singleton
object Resource {
    var name = "Name"

    override fun toString(): String {
         return  name;
    }
}