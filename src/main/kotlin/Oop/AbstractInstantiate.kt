fun main(){
    val myDog = object : Animal() {
        override fun makeSound() {
            println("How how")
        }
    }
    val myCat = object : Animal() {
        override fun makeSound() {
            println("Miu miu")
        }
    }
    myDog.makeSound()
    myCat.makeSound()
}

abstract class Animal{
    abstract  fun makeSound()
}