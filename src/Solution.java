import java.util.HashMap;
import java.util.Map;

class Solution {
    /*public int removeElement(int[] nums, int val) {
        int[] arr = nums;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                nums[len++] = arr[i];
            }
        }
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i]+" ");
        //System.out.println(nums);
        return len;
    }*/

    /*public int removeDuplicates(int[] nums) {
        int k = 0;
        int arr[] = nums;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.get(arr[i]) != null) {
                int c = mp.get(arr[i]);
                mp.put(arr[i], ++c);
            } else {
                mp.put(arr[i], 1);
            }

        }
        for (int i = 0,j=0; i < arr.length; i++) {
            if (mp.get(arr[i]) == 1) {
                nums[j++] = arr[i];
                k++;
            } else {
                int c = mp.get(arr[i]);
                mp.put(arr[i], --c);
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + " ");
        }
        return k;
    }*/
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int arr[] = nums;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.get(arr[i]) != null) {
                int c = mp.get(arr[i]);
                mp.put(arr[i], ++c);
            } else {
                mp.put(arr[i], 1);
            }

        }
        for (int i = 0,j=0; i < arr.length; i++) {
            if (mp.get(arr[i]) <= 2) {
                nums[j++] = arr[i];
                k++;
            } else {
                int c = mp.get(arr[i]);
                mp.put(arr[i], --c);
            }
        }
        return k;
    }
    public static void main(String[] args) {
        final Solution solution = new Solution();
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        final int i = solution.removeDuplicates(nums);
        System.out.println("\n" + i);
    }
}