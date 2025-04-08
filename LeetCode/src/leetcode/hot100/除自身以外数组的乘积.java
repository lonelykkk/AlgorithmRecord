package leetcode.hot100;

/**
 * 238. 除自身以外数组的乘积
 * 提示
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 * 链接：
 * https://leetcode.cn/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int contZero = 0;
        int sum = 1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum *= nums[i];
            } else {
                contZero++;
            }
        }
        if (contZero >= 2) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            if (contZero > 0) {
                if (nums[i] != 0) {
                    res[i] = 0;
                } else {
                    res[i] = sum;
                }
            } else {
                res[i] = sum / nums[i];
            }
        }
        return res;
    }
}
