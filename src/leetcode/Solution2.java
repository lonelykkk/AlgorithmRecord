package leetcode;

class Solution2 {
    public int maxProfit(int[] prices) {
        int minPoint = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPoint) {
                minPoint = prices[i];
            } else {
                res = Math.max(res, prices[i] - minPoint);
            }
        }
        return res;
    }
}