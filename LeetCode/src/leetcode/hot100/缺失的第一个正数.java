package leetcode.hot100;

/**
 * 41. 缺失的第一个正数
 * 提示
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 *
 * 链接：
 * https://leetcode.cn/problems/first-missing-positive/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 缺失的第一个正数 {
    public int firstMissingPositive(int[] nums) {
        boolean[] flag = new boolean[100010];
        int len1 = nums.length;
        int len2 = flag.length;
        for (int i = 0; i < len1; i++) {
            if (nums[i] > 0 && nums[i] < flag.length) {
                flag[nums[i]] = true;
            }
        }

        for (int i = 1; i < len2; i++) {
            if (!flag[i]) {
                return i;
            }
        }
        return len1;
    }
}
