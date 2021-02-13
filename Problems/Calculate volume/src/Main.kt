fun getVolume(length: Int, width: Int = 1, height: Int=1): Int{
    when {
        height == -1 || width == -1 -> return 1
        else -> return length * width * height
    }
}