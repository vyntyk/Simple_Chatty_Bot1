fun main() {
    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }
    //write your code here
    val a = inputArray
    println("${a[0][0]} ${a[0].last()}")
    val i = a.lastIndex
    println("${a[i][0]} ${a[i].last()}")
}