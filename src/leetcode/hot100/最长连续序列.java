package leetcode.hot100;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 *
 * 链接：
 * https://leetcode.cn/problems/longest-consecutive-sequence/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 最长连续序列 {

    public int longestConsecutive(int[] nums) {
        int maxn = 1;
        int len = 1;
        Arrays.sort(nums);
        // 数组去重
        nums = Arrays.stream(nums).distinct().toArray();
        // 特判
        if(nums.length==0){
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

    public static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
