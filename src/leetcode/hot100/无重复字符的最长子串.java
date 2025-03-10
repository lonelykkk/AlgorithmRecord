package leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串 - 滑动窗口
 * 提示
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
 *
 * 链接
 * https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, maxn = 0;
        int len = s.length();
        char[] str = s.toCharArray();
        // 用于记录每个字符是否出现过
        Map<Character, Boolean> map = new HashMap<>();
        while (l <= r && r < len) {
            if (map.containsKey(str[r])) {
                // 如果出现过，左指针向右移动
                map.remove(str[l]);
                l++;
            } else {
                // 没出现过，右指针继续向右移动
                map.put(str[r], true);
                r++;
            }
            maxn = Math.max(maxn, r - l);
        }
        return maxn;
    }

    public static void main(String[] args) {
        System.out.println(new 无重复字符的最长子串().lengthOfLongestSubstring("pwwkew"));
    }
}
