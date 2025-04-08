package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 283. 移动零
 * 提示
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * 链接：
 * https://leetcode.cn/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 移动零 {
    public void moveZeroes(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                list2.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }
        }
        list1.addAll(list2);
        int k = 0;
        for (Integer integer : list1) {
            nums[k++] = integer;
        }
    }

    /**
     * 双指针解法
     * @param nums
     */
    public void moveZeroes2(int[] nums) {
        int l = 0, r = 0; // 左右指针
        for (int i = 0; i < nums.length; i++) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
