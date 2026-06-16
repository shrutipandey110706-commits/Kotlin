class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()

        for (op in operations) {
            when (op) {
                "C" -> {
                    stack.removeAt(stack.lastIndex)
                }

                "D" -> {
                    stack.add(stack.last() * 2)
                }

                "+" -> {
                    val size = stack.size
                    stack.add(stack[size - 1] + stack[size - 2])
                }

                else -> {
                    stack.add(op.toInt())
                }
            }
        }

        return stack.sum()
    }
}