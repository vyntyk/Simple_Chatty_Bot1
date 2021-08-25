fun main() {
    val n = readLine()!!.toInt()
    val income = List(n) { readLine()!!.toInt() }
    val tax = List(n) { readLine()!!.toInt() * income[it] / 100.0 }
    println(tax.indexOf(tax.maxOrNull()) + 1)
}