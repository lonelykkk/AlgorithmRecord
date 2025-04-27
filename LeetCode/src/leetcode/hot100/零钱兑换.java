package leetcode.hot100;

import java.util.Arrays;

/**
 * 322. 零钱兑换
 *
 * 链接：
 * https://leetcode.cn/problems/coin-change/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }

            }
        }
        if (dp[amount] > amount) {
            return -1;
        }
        return dp[amount];
    }
}
