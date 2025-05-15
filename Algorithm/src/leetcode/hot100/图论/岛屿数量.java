package leetcode.hot100.图论;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/15 11:19
 * @Version V1.0
 */
public class 岛屿数量 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    solve(grid, i, j);
                }
            }
        }
        return count;
    }

    public void solve(char[][] grid, int r, int c) {
        int x = grid.length;
        int y = grid[0].length;
        if (r < 0 || r >= x || c < 0 || c >= y || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        solve(grid, r - 1, c);
        solve(grid, r + 1, c);
        solve(grid, r, c - 1);
        solve(grid, r, c + 1);
    }
}
