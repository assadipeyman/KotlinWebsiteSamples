import java.awt.Color

fun main(args: Array<String>) {
    val colorRange= ColorRange(Color(1,1,1),Color(2,2,2))

    for (i in colorRange.withIndex()) {
        println("$i")
    }
}

class ColorRange(val start: Color , val end: Color ): Iterator<Color> {
    private var currentColor= start;
    override fun hasNext(): Boolean {
        var r: Int = currentColor.getRed()
        var g: Int = currentColor.getGreen()
        var b: Int = currentColor.getBlue()
          return  !(r>=end.red && g>=end.green && b>=end.blue)
    }

    override fun next(): Color {
        var r: Int = currentColor.getRed()
        var g: Int = currentColor.getGreen()
        var b: Int = currentColor.getBlue()
        b++
        if(b==256){
           b=0
           g++
           if(g==256) {
               r++
               g=0
               if (r == 256) {
                   r = 0
               }
           }
        }
        currentColor = Color(r,g,b)
        return currentColor
    }

}
