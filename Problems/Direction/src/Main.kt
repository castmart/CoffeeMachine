fun main(args: Array<String>) {
    // write your code here

    when (readLine()?.toInt()) {
        1 -> print("move up")
        2 -> print("move down")
        3 -> print("move left")
        4 -> print("move right")
        0 -> print("do not move")
        else -> print("error!")
    }
}