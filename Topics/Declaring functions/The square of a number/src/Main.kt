fun square(number: Int): Int {
    val square = number * number
    return square

}

/* Do not change code below */
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}