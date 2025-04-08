package leetcode;

/**
 * 238. 除自身以外数组的乘积
 * 前缀和解法
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。

 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。

 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
class Solution8 {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        int[] arr = new int[nums.length];
        L[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            L[i] = L[i - 1] * nums[i - 1];
        }
        R[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }
        // 对于索引 i，除 nums[i] 之外其余各元素的乘积就是左侧所有元素的乘积乘以右侧所有元素的乘积
        for (int i = 0; i < nums.length; i++) {
            arr[i] = L[i] * R[i];
        }

        return arr;
    }
}