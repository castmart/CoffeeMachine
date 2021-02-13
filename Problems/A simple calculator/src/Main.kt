import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val numberOne = scanner.nextLong()
    val operator = scanner.next()
    val numberTwo = scanner.nextLong()

    when (operator) {
        "+" -> print(numberOne + numberTwo)
        "-" -> print(numberOne - numberTwo)
        "*" -> print(numberOne * numberTwo)
        "/" -> if (numberTwo != 0L) print(numberOne / numberTwo) else print("Division by 0!")
        else -> print("Unknown operator")
    }
}