class Block(val color: String) {
    object DimProperties {
        var length: Int = 6
        var width: Int = 4

        fun blocksInBox(boxLength: Int, boxWidth: Int): Int {
            val widthFit = boxWidth / DimProperties.width
            val lengthFit = boxLength / DimProperties.length
            return widthFit * lengthFit
        }
    }
}