package leetcode.hot100;

import java.util.*;

/**
 * 49. 字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 *
 * 链接：
 * https://leetcode.cn/problems/group-anagrams/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            // 将单词排序，如eat,tea将被排序为aet
            char[] s = str.toCharArray();
            Arrays.sort(s);
            // 将排序后的单词作为key，原始单词存入value的集合中
            String key = new String(s);
            // 获取当前键对应的列表，如果不存在则创建一个新列表
            List<String> list = hashMap.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            hashMap.put(key, list);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
