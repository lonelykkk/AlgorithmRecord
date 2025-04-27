package leetcode.hot100;

/**
 * 279. 完全平方数
 *
 * 链接：
 * https://leetcode.cn/problems/perfect-squares/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 完全平方数 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 0; j * j <= i; j++) {
                minn = Math.min(minn, dp[i - j * j]);
            }
            dp[i] = minn;
        }
        return dp[n];
    }
}
