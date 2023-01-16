import kotlin.math.abs

fun getLastDigit(if(a > 0) a % 10 else -a % 10)

}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}