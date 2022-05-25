fun main() {
    //Kotlin uses == for structural comparison and === for referential comparison

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
    val books = listOf("batar kitab" , "chokh batar kitab" , "bosh kitab")
    val books2 =books.toList()
    println(authors == writers)   // 1
    println(authors.equals(writers))
    println(authors === writers)  // 2


    println(authors ==books)
    println(authors ===books)

    println(books ==books2)
    println(books ===books2)
    println(books.equals(books2))
}
