package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int k = len / 2;
        int res = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (mp.get(nums[i]) != null) {
                int c = mp.get(nums[i]);
                mp.put(nums[i], ++c);
            }
            else {
                mp.put(nums[i], 1);
            }
        }
        for (int i = 0; i < len; i++) {
            if (mp.get(nums[i]) > k) {
                res = mp.get(nums[i]);
                return nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 3};
        final Solution solution = new Solution();
        solution.majorityElement(arr);
    }
}