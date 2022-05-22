
fun main(){

    //below line make read only map. a is key and 1 is value
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    //map.add -> it does't have add  method
    println(map["b"])

    //Traverse a map or a list of pairs
    for((k,v) in map)
        print("$k -> $v , ")

    println()

    val hashMap  = HashMap<String , Int>()
    for (i:Int in 1..10)
        hashMap["key$i"] = i

    println()

    for ((k,v) in hashMap)
          print("[$k -> $v] ")

    println()

    for(i:Int in 1..10) {
        val k = hashMap["key$i"]
        print("[key$i -> $k] ")
    }

}