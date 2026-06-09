class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str= x.toString() //convets int to string
        return str==str.reversed()
        
    }
}