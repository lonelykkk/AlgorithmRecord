package leetcode.hot100;

/**
 * 300. 最长递增子序列
 *
 * 链接：
 * https://leetcode.cn/problems/longest-increasing-subsequence/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[i] > nums[j]) {
                    res[i] = Math.max(res[i], res[j] + 1);
                }
            }
        }
        int maxn = 0;
        for (int i = 0; i < nums.length; i++) {
            maxn = Math.max(maxn, res[i]);
        }
        return maxn;
    }
}
