package leetcode;

class Solution1 {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            arr[(i+k)%len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        final Solution1 solution1 = new Solution1();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        solution1.rotate(arr,3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}