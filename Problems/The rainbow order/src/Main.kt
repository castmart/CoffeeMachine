import java.util.stream.Stream

enum class Rainbow(val color:String, val int_val:Int) {
    RED("red",1), ORANGE("orange", 2),
    YELLOW("yellow", 3), GREEN("green", 4),
    BLUE("blue", 5), INDIGO("indigo", 6),
    VIOLET("violet", 7), NULL("", -1);

    companion object {
        fun getEnumValue(name: String): Rainbow {
            for (rainbow:Rainbow in Rainbow.values()) {
                if (rainbow.color.equals(name)) {
                    return rainbow
                }
            }
            return NULL
        }
    }
}
fun main() {
    val color = readLine()!!
    // put your code here
    println(Rainbow.getEnumValue(color).int_val)
}