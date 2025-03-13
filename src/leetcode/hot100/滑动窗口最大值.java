package leetcode.hot100;

import java.util.*;

/**
 * 239. 滑动窗口最大值
 * 提示
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回 滑动窗口中的最大值 。
 *
 * 链接：
 * https://leetcode.cn/problems/sliding-window-maximum/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 先比较元素，如果元素大就放在首端，如果相等就比较下标，把下标靠后的元素放在队首
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        int[] res = new int[nums.length - k + 1]; // 存结果的数组
        res[0] = pq.peek()[0];
        for (int i = k; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) { // 如果当前元素是最大但是不在滑动窗口中，就将该元素移除队列
                pq.poll();
            }
            res[i - k + 1] = pq.peek()[0];
        }
        return res;
    }
}
