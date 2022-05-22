package Collections

fun main(args: Array<String>) {
    println("Application started...")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    println(
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .toString()
    )
}
