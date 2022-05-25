import java.io.File

fun main() {

    var  arr: MutableList<Int> = mutableListOf()
    readFileAsLinesUsingUseLines("C://Repository//KotlinSelfCourse//input.txt").forEach {
        arr.add(it.toInt())
    }

    for (i in 0 until arr.size)
        for (j in i + 1 until arr.size)
            for (k in j + 1 until arr.size)
            if (arr[i] + arr[j] + arr[k] == 2020)
                println( arr[i] * arr[j] * arr[k] )
}

fun readFileAsLinesUsingUseLines(fileName: String): List<String>
        = File(fileName).useLines { it.toList() }