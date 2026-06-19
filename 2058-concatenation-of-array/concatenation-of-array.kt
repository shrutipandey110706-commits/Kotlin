class Solution {
    fun getConcatenation(nums: IntArray): IntArray {

        val n = nums.size
        val ans = IntArray(2 * n)

        for (i in nums.indices) {
            ans[i] = nums[i]       // First copy
            ans[i + n] = nums[i]   // Second copy
        }

        return ans
    }
}