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
        int i = 0;
        int arr[] = new int[nums.length];
        arr[i] = 1;
        while (true) {
            i += nums[i];
            if (i >= nums.length - 1) {
                break;
            }

            if (i == 0) {
                return false;
            }
            while (arr[i] == 1) {
                i--;
                if (i == 0) {
                    return false;
                }
            }
            arr[i] = 1;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1,0,4};
        System.out.println(new Solution4().canJump(arr));
    }
}