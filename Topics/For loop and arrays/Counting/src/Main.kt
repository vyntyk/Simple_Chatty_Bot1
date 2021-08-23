fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    println(numbers.filter { it == m }.size)
}