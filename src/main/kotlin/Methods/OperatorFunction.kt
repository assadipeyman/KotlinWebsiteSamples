fun main() {

    val c1 = Circle(11.0)
    val c2 = Circle(3.0)

    println("C1: ${c1.radius} Area:${c1.area()}")
    println("C2: ${c2.radius} Area:${c2.area()}")

    println("C2: ${(c1+c2).radius} Area:${(c1+c2).area()}")
    println("C2: ${(c1-c2).radius} Area:${(c1-c2).area()}")
}

class Circle(val radius:Double){
    fun area():Double{
        return Math.PI * radius*radius
    }

    operator fun plus(c:Circle):Circle { // calculate radus of circle to area be sum of two circle's area
        return Circle(Math.sqrt((area() + c.area()) / Math.PI))
    }
    operator fun minus(c:Circle):Circle{
        return  Circle(Math.sqrt ((area() - c.area())/Math.PI))
    }
}


