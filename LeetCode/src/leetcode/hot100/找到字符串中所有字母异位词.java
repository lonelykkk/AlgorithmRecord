package leetcode.hot100;

import java.util.*;

/**
 * 438. 找到字符串中所有字母异位词
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 *
 *链接：
 * https://leetcode.cn/problems/find-all-anagrams-in-a-string/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 找到字符串中所有字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        char[] str1 = s.toCharArray();
        char[] str2 = p.toCharArray();
        int len = str2.length;
        int l = 0, r = len - 1;
        int[] res = new int[30];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int index = str2[i] - 'a';
            res[index]++;
        }
        while (r < str1.length) {
            int[] ans = new int[30];
            boolean flag = true;
            for (int i = l; i <= r; i++) {
                int c = str1[i] - 'a';
                ans[c]++;
            }
            for (int i = 0; i < 30; i++) {
                if (ans[i] != res[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(l);
            }
            l++;
            r++;
        }

        return list;
    }

    /**
     * leetcode解法
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams2(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();  //  arraylist是有序的，有索引的
        int[] sCount = new int[26];  // 整数，记录26个小写字母的索引，a对应索引0，b对应索引1..... 每个索引对应的值，为该字母出现的次数，初始次数都是0；
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; i++) { // 按照p字符数组的长度去遍历
            ++sCount[s.charAt(i) - 'a']; // s.chartAt(i)得到此处的字母，-"a"，得到该字母的索引，++表示统计该字母的出现次数。
            ++pCount[p.charAt(i) - 'a'];
        }
        //判断放置处是否有异位词。若相等，则表明s的前几位就是p的异位词。起始索引即为0.
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a']; // 减去滑动窗口的第0位，即，窗口变为1，2
            ++sCount[s.charAt(i + pLen) - 'a']; // 加上窗口的第plen位(第3位)，即，窗口变为1，2，3
            // 完成了一次滑动窗口
            // 若相等，存在异位词，起始索引为i+1
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
