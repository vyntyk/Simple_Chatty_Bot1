fun main() {
    val array = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var counter = 0

    for (index in 1 until array.size - 1) {
        if (array[index - 1] == array[index] - 1 && array[index + 1] == array[index] + 1) {
            counter++
        }
    }
    println(counter)
}