import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val array = IntArray(n)

    for (i in 1..n) {
        array[i % n] = scanner.nextInt()
    }

    println(array.joinToString(" "))
}