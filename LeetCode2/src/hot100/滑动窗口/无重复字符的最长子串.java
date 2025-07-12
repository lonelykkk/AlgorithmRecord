package hot100.滑动窗口;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/12 9:34
 * @Version V1.0
 */
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxn = 0;
        int len = s.length();
        Map<Character, Boolean> map = new HashMap<>();
        char[] str = s.toCharArray();
        while (l <= r && r < len) {
            if (!map.containsKey(str[r])) {
                map.put(str[r], true);
                r++;
                maxn = Math.max(maxn, r - l);
            } else {
                map.remove(str[l]);
                l++;
            }
        }
        return maxn;
    }
}
