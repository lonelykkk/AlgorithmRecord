package leetcode;

/**
 * 55. 跳跃游戏
 * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
 *
 * 示例 1：
 * 输入：nums = [2,3,1,1,4]
 * 输出：true
 * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
 */
class Solution4 {
    public boolean canJump(int[] nums) {
        int max = 0;
        int k = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                k = i + nums[i];
            }else {
                return false;
            }

            max = Math.max(max, k);
            if (max >= nums.length) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};
        System.out.println(new Solution4().canJump(arr));
    }
}