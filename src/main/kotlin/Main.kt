fun main(args: Array<String>) {
    println("Application started on package ${ ClassLoader.getSystemClassLoader().name }")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")

    println(
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .toString()
    )
}