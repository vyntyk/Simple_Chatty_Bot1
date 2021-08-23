fun main() {
    // write your code here
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }

    val max = numbers.maxOrNull()?.let { numbers.indexOf(it) }
    println(max)
}