import java.util.function.BiPredicate

fun main() {
    val zo = Zoo(listOf(Anim("Dog"), Anim("Cat"), Anim("Monkey")))

    for (z in zo)
        println(z.name)

    println()

    val it = zo.iterator()
    while (it.hasNext()) {
        println(it.next().name)
    }


}

class Anim(val name:String)
class Zoo(val animals:List<Anim>){
    operator  fun iterator():Iterator<Anim> {
        return animals.iterator()
    }
}
