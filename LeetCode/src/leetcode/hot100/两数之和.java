package leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 提示
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 *
 * 连接：
 * https://leetcode.cn/problems/two-sum/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 两数之和 {

    /**
     * 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    /**
     * 哈希算法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        // 创建一个哈希表，用于存储数组中的元素及其对应的下标
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();

        // 遍历数组中的每一个元素
        for (int i = 0; i < nums.length; ++i) {
            // 检查哈希表中是否存在一个键，使得该键与当前元素的和等于 target
            if (hashtable.containsKey(target - nums[i])) {
                // 如果存在，返回这两个数的下标
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            // 如果不存在，将当前元素及其下标存入哈希表
            hashtable.put(nums[i], i);
        }

        // 如果没有找到符合条件的两个数，返回一个空数组
        return new int[0];
    }
}
