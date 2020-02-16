import kotlin.math.roundToInt

fun main () {

    var userChoice: Int = 0

    println("Choose from the following shapes.")
    println("1. Triangle")
    println("2. Square")
    println("3. Rectangle")
    println("4. Circle")

    while (userChoice<1 || userChoice>4) {
        print("Enter shape to calculate the area using your keypad")
        userChoice = readLine()!!.toInt()

        if (userChoice == 1) {
            println("Ok, triangle")
            triangle()
        } else if (userChoice == 2) {
            println("You choose square")
            square()
        } else if (userChoice == 3) {
            println("Let's calculate a rectangle")
            rectangle()
        } else if (userChoice == 4) {
            println("Circle it is!")
            circle()
        } else {
            print("Oops! ")
        }
    }

}

fun triangle() {
    println("Enter the base (B) and height (H) on the next two lines")
    var b:Int = 0
    var h:Int = 0
    b = readLine()!!.toInt()
    h = readLine()!!.toInt()
    val areaTriangle = b*h/2
    println("The area of the triangle is: $areaTriangle")
}

fun square() {
    println("Enter the length of any side (S)")
    var s:Int = 0
    s = readLine()!!.toInt()
    val areaSquare: Int = s*s
    println("The area of your square is: $areaSquare")
}
fun rectangle() {
    println("Enter the length (L) and width (W) on the next two lines")
    var l:Int = 0
    var w:Int = 0
    l = readLine()!!.toInt()
    w = readLine()!!.toInt()
    val areaRectangle: Int = l*w
    println("The area of your square is: $areaRectangle")
}
fun circle() {
    println("Enter the radius (not the diameter!)")
    var r:Int = 0
    r = readLine()!!.toDouble().roundToInt()
    val areaCircle= r*r*3.14
    println("The area of your square is: $areaCircle")
}

