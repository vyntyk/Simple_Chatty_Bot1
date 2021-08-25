import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val p = scanner.nextInt()
    val m = scanner.nextInt()
    println(if (array.contains(p) && array.contains(m)) "YES" else "NO")
}