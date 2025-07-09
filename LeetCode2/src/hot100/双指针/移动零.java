package hot100.双指针;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/9 23:44
 * @Version V1.0
 */
public class 移动零 {
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }

    public void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
