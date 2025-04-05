package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        List<Integer> list = new ArrayList<>();
        while (!sc.hasNextInt()) {
            int a = sc.nextInt();
            list.add(a);
        }
        int len = list.size();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);

        int a1 = nums[0] * nums[1] * nums[len-1];
        int a2 = nums[len - 1] * nums[len  - 2] * nums[len - 3];
        int maxn = Math.max(a1, a2);
        System.out.println(maxn);
    }
}
