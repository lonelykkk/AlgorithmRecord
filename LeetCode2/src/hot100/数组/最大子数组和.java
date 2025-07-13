package hot100.数组;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/13 18:10
 * @Version V1.0
 */
public class 最大子数组和 {
    public int maxSubArray(int[] nums) {
        int maxn = Integer.MIN_VALUE;
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            maxn = Math.max(pre, maxn);
        }
        return maxn;
    }
}
