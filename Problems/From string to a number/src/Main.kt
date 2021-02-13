fun main(args: Array<String>) {
    // write your code here
    val number = readLine()

    when (number) {
        "one" -> print(1)
        "two" -> print(2)
        "three" -> print(3)
        "four" -> print(4)
        "five" -> print(5)
        "six" -> print(6)
        "seven" -> print(7)
        "eight" -> print(8)
        "nine" -> print(9)
        else -> print("Not a number in range 1-9")
    }
}