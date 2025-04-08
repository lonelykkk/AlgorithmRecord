package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BFS求最短路问题
 */
public class 走迷宫BFS {
    private int bfs(int[][] g,int[][] d,int n,int m) {
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        List<int[]> queue = new ArrayList<>();
        queue.add(new int[]{0, 0});
        int head = 0, tail = 0;
        while (head <= tail) {
            // 获取队头元素
            int[] res = queue.get(head);
            // 获取当前坐标
            int currX = res[0];
            int currY = res[1];
            // 移除队头元素
            head++;
            for (int i = 0; i < 4; i++) {
                int x = currX + dx[i];
                int y = currY + dy[i];
                if (x >= 0 && x < n && y >= 0 && y < m && g[x][y] == 0 && d[x][y] == 0) {
                    d[x][y] = d[currX][currY] + 1;
                    queue.add(new int[]{x, y});
                    tail++;
                }
            }

        }
        return d[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] g = new int[n][m];
        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new 走迷宫BFS().bfs(g, d, n, m));
    }
}
