package leetcode.hot100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 *
 * 链接：
 * https://leetcode.cn/problems/rotting-oranges/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 腐烂的橘子 {

    private int[] dx = {0, 1, 0, -1};
    private int[] dy = {1, 0, -1, 0};
    private int count = 0;
    private int cnt = 0;

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        if (queue.isEmpty() && count > 0) {
            return -1;
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] head = queue.poll();
                int x = head[0];
                int y = head[1];
                for (int j = 0; j < dx.length; j++) {
                    int p = x + dx[j];
                    int q = y + dy[j];
                    if (p >= 0 && p < grid.length && q >= 0 && q < grid[0].length && grid[p][q] == 1) {
                        grid[p][q] = 2;
                        queue.offer(new int[]{p, q});
                        count--;
                    }
                }
            }
            if (!queue.isEmpty()) {
                cnt++;
            }
        }
        if (count > 0) {
            return -1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 2}};
        System.out.println(new 腐烂的橘子().orangesRotting(grid));
    }
}
