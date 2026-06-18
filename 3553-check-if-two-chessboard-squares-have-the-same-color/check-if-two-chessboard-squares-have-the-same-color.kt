class Solution {
    fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {
        val color1 = ((coordinate1[0] - 'a') + (coordinate1[1] - '0')) % 2
        val color2 = ((coordinate2[0] - 'a') + (coordinate2[1] - '0')) % 2

        return color1 == color2
}
} 