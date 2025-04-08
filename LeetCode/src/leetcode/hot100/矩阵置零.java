package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 73. 矩阵置零
 * 数组、矩阵
 * 链接：
 * https://leetcode.cn/problems/set-matrix-zeroes/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 矩阵置零 {
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        for (int[] res : list) {
            int x = res[0];
            int y = res[1];
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[x][i] = 0;
            }
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        new 矩阵置零().setZeroes(matrix);
    }
}
