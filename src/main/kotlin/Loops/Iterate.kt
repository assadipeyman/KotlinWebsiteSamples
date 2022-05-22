fun main(){
    for (i in 1..10) { print("$i ") }  // closed range: includes 100
    println()
    for (i in 1 until 10) {  print("$i ") } // half-open range: does not include 100
    println()
    for (x in 1..10 step 2) {  print("$x ") }
    println()
    for (x in 2..10 step 2) {  print("$x ") }
    println()
    for (x in 10 downTo 1) {  print("$x ") }
    println()
    for (x in 10 downTo 1 step 2) {  print("$x ") }
    println()
    (1..10).forEach {  print(it) }

}