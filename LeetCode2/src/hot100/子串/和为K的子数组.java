package hot100.子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/13 17:08
 * @Version V1.0
 */
public class 和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
