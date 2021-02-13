fun main() {
    val input = readLine()!!
    when {
        input.startsWith("i") -> println(input.drop(1).toInt() + 1)
        input.startsWith("s") -> println(input.drop(1).reversed())
        else -> println(input)
    }
}