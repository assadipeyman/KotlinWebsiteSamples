fun main(){

    printLnAll(1 ,2,3 ,"4" , "5")
    printAll(1 ,2,3 ,"4" , "5")

}

fun printLnAll(vararg params:Any){

    for (p in params){
        if(p is String)
            println("$p: String")
        else if(p is Int)
            println("$p: Int")
    }
}

fun printAll(vararg params:Any){
    for(x in params)
        print(x)
}




