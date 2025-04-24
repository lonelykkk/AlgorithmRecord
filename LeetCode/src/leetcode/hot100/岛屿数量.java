package leetcode.hot100;

/**
 * 200. 岛屿数量
 *
 * 链接：
 * https://leetcode.cn/problems/number-of-islands/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int count = 0;
        int x = grid.length;
        int y = grid[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        int x = grid.length;
        int y = grid[0].length;
        if (r < 0 || r >= x || c < 0 || c >= y || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
