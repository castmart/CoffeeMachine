fun main() {
    // write your code here
    val userName = readLine()!!
    if (userName == "HIDDEN") {
        println("Hello, secret user!")
    } else {
        println("Hello, $userName!")
    }
}