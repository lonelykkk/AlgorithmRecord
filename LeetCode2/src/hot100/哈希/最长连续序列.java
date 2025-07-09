package hot100.哈希;

import java.util.Arrays;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/9 8:53
 * @Version V1.0
 */
public class 最长连续序列 {
    public int longestConsecutive(int[] nums) {
        int len = 1;
        int maxn = 1;
        Arrays.sort(nums);
        nums = Arrays.stream(nums).distinct().toArray();
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                len++;
                maxn = Math.max(maxn, len);
            } else {
                len = 1;
            }
        }
        return maxn;
    }
}
