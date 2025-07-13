package hot100.子串;

import java.util.PriorityQueue;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/13 17:35
 * @Version V1.0
 */
public class 滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] o1, int[] o2) -> {
            return o1 != o2 ? o2[0] - o1[0] : o2[1] - o1[1];
        });
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            queue.offer(new int[]{nums[i], i});
        }
        res[0] = queue.peek()[0];
        for (int i = k; i < nums.length; i++) {
            queue.offer(new int[]{nums[i], i});
            while (queue.peek()[1] <= i - k) {
                queue.poll();
            }
            res[i - k + 1] = queue.peek()[0];
        }
        return res;
    }
}
