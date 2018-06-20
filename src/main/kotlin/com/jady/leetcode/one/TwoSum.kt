package com.jady.leetcode.one

object TwoSum {

    @JvmStatic
    fun main(args: Array<String>) {
        val intArray = intArrayOf(2, 5, 5, 11)
        println(twoSum(intArray, 10)?.joinToString())
    }

    private fun twoSum(nums: IntArray, target: Int): IntArray {
        val size = nums.size
        for (i in 0 until size - 1) {
            println(i)
            (i + 1 until size)
                    .filter {
                        nums[i] + nums[it] == target
                    }
                    .forEach { return intArrayOf(i, it) }
        }
        return intArrayOf()
    }
}