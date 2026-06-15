class Solution {
    fun reverseBits(n: Int): Int {
        var num = n
        var result = 0

        repeat(32) {
            result = result shl 1          // Make space for next bit
            result = result or (num and 1) // Take last bit of num and add it
            num = num ushr 1              // Move to the next bit
        }

        return result
    }
}