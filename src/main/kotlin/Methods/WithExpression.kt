fun main(){
    val obj = ManyMethodClass()
    with(obj){
        println(method1())
        for (i in 1..5) {
            print(method2())
            print(method3())
        }
        println()
        println(method4())
    }
}

class ManyMethodClass{
    fun method1():String { return "1"}
    fun method2():String { return "2"}
    fun method3():String { return "3"}
    fun method4():String { return "4"}

}