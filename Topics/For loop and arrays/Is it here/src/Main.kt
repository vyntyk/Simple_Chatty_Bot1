fun main() {
    // write your code here
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val m = readLine()!!.toInt()
    if (numbers.contains(m)) println("YES") else println("NO")
}