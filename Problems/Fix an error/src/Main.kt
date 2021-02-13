class Player(val id: Int, val name: String) {
    companion object {
        var role = "playable character"
        fun getInfo(id: Int, name: String) = "$id, $name, $role"
    }
}

fun getPlayerInfo(player: Player) = Player.Companion.getInfo(player.id, player.name)