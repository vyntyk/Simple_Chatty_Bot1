import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val sc = Scanner(System.`in`)
    val entry = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var n = sc.nextInt()
    n %= entry.size
    for (i in 0 until n) {
        var last: Int = entry[entry.size - 1]
        var j: Int = entry.size - 1
        while (j > 0) {
            entry[j] = entry[j - 1]
            j--
        }
        last.also { entry[0] = it }
    }
    for (i in entry.indices) {
        print(entry[i])
        print(" ")
    }

}
