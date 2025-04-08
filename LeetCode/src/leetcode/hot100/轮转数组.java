package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 189. 轮转数组
 * 提示
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *
 * 链接：
 * https://leetcode.cn/problems/rotate-array/solutions/?envType=study-plan-v2&envId=top-100-liked
 */
public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[(i + k) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = res[i];
        }
    }
}
