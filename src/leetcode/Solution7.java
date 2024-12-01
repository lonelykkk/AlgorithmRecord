package leetcode;

/**
 * 238. 除自身以外数组的乘积
 * 提示
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。

 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。

 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
class Solution7 {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int count = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum *= nums[i];
            } else {
                count++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            if (count > 2) {
                arr[i] = 0;
            } else if (count == 1) {
                if (nums[i] != 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = sum;
                }

            } else if (count == 0) {
                arr[i] = sum / nums[i];
            }

        }

        return arr;
    }
}