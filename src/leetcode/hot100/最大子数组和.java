package leetcode.hot100;

/**
 * 53. 最大子数组和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组是数组中的一个连续部分。
 *
 * 链接：
 * https://leetcode.cn/problems/maximum-subarray/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int maxn = -0x3ffffff;
        int[] s = new int[nums.length+1];
        s[0] = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (i > 0) {
                s[i] = s[i - 1] + nums[i - 1];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (s[i - 1] < 0) {
                // 如果前面是负数，那么s[i]-s[i-1] 一定比s[i]大
                maxn = Math.max(maxn, s[i] - s[i - 1]);
            } else {
                // 否则s[i]-s[i-1] 一定比s[i]小
                maxn = Math.max(maxn, s[i]);
            }
            if (s[i] > s[i - 1]) {
                // 把更小的前缀和放到s[i] 前面，这样s[i]-s[i-1]是不会影响到连续数组的
                s[i] = s[i - 1];
            }
        }
        return maxn;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new 最大子数组和().maxSubArray(nums));
    }
}
