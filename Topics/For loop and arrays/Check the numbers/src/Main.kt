import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val array = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val p = scanner.nextInt()
    val m = scanner.nextInt()
    for (i in 0 until array.size - 1) {
        if (array[i] == m) {
            if (array[i + 1] == p) {
                println("NO")
                return
            }
        }
        if (array[i] == p) {
            if (array[i + 1] == m) {
                println("NO")
                return
            }
        }
    }
    println("YES")
}