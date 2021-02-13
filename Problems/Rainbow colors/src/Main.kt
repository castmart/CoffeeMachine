enum class Rainbow {
    red, orange, yellow, green, blue, indigo, violet;
}

fun main() {
    // put your code here
    val color = readLine()!!
    try {
        val rainbow = Rainbow.valueOf(color)
        println(true)
    } catch (e: Exception) {
        println(false)
    }

}