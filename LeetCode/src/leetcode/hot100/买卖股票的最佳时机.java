package leetcode.hot100;

import java.util.Arrays;

/**
 * 121. 买卖股票的最佳时机
 *
 * 链接：
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/description/
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int flag = prices[0];
        int[] nums = new int[prices.length];
        int m = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < flag) {
                flag = prices[i];
            }
            m = Math.max(m, prices[i] - flag);
        }
        return m;
    }
}
