package leetcode.hot100.动态规划;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/18 20:12
 * @Version V1.0
 */
public class 最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int maxn = 0;
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxn = Math.max(maxn, dp[i]);
        }
        return maxn;
    }
}
