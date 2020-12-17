package twosum

fun main(args: Array<String>) {
    val inputs = intArrayOf(0, 4, 3, 0)
    val target = 0
    val result = Solution.twoSum(inputs, target)
    print("This is the result array ${result.asList()}")
}

class Solution {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val resultArray = IntArray(2)
            val elementsMap = HashMap<Int, Int>()

            nums.forEachIndexed { index, item ->
                if (elementsMap.containsKey(target - item) && elementsMap[target - item] != index) {
                    resultArray[0] = elementsMap[target - item] ?: 0
                    resultArray[1] = index
                    return@forEachIndexed
                }
                elementsMap[item] = index
            }

            return resultArray
        }
    }
}