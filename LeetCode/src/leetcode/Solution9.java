package leetcode;

/**
 * 134. 加油站
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
 *
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/2/28 20:16
 * @Version V1.0
 */
public class Solution9 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int spare = 0;
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < len; i++) {
            spare += gas[i] - cost[i];
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }

        return spare < 0 ? -1 : (minIndex + 1) % len;
    }


    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4};
        int cost[] = {4, 4, 1, 5, 1};
        System.out.println(new Solution9().canCompleteCircuit(arr,cost));
    }
}
