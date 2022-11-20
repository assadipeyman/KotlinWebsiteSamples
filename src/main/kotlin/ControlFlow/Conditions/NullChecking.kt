import java.io.File
fun main() {
    val files = File("test folder").listFiles()
    println(files?.size?:0)

    println(files?.size ?: run { File("").absolutePath })// size is printed if files is not null

    println(files ?: "This filder  is null")

    File(".//").listFiles()?.let {
        println( it.joinToString(separator = " - ")) // execute this block if not null
    }

}
