class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        fun create(name: String): Player {
            return Player(kotlin.random.Random.nextInt(0, 100), name, 100)
        }
    }
}