package Collections

fun main(args: Array<String>) {
    println("Application started...")

    val fruits = listOf("banana", "avocado", "apple1","aPple2" , "kiwifruit")

    println(
        fruits
            .map { it +"-"+ it.length.toString() }
    )
    println(
        fruits
            .any { it=="apple1" }
    )

    println(
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .toString()
    )
    //predicates are exexute in the order of lines so making uppercase changes sort of results
    println(
        fruits
            .filter { it.startsWith("a") }
            .map { it.uppercase() }
            .sortedBy { it }
            .toString()
    )

    //This lines of codes print anything because making uppercase by Map predicate changes all 'a' to 'A' so filter predicate did not return anything
    println(
        fruits
            .map { it.uppercase() }
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .toString()
    )
}
