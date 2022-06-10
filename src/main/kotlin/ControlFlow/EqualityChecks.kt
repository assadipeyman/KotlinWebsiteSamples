fun main() {
    //Kotlin uses == for structural comparison and === for referential comparison

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
    val books = listOf("batar kitab" , "chokh batar kitab" , "bosh kitab")
    println(authors == writers)   // 1
    println(authors.equals(writers))
    println(authors == writers.toList())   // 1
    println(authors === writers)  // 2


    println(authors ==books)
    println(authors ===books)

    val books2 =books.toList()
    println(books ==books2)
    println(books ===books2)
    println(books.equals(books2))

    val fl:Float = 0.0F
    val db:Double = 0.0
    println(fl.equals(db))

    val fl1:Float = 0.0F
    val fl2:Float = -0.0F
    println(fl1==fl2)
    println(fl1.equals(fl2))
}
