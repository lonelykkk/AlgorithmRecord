package leetcode.hot100;

/**
 * 35. 搜索插入位置
 *
 * 链接：
 * https://leetcode.cn/problems/search-insert-position/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, res = nums.length;
        while (l <= r) {
            int mid = (l + r) / 2 + 1;
            if (target <= nums[mid]) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
