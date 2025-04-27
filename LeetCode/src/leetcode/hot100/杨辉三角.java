package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 *
 * 链接：
 * https://leetcode.cn/problems/pascals-triangle/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rows.add(1);
                } else {
                    rows.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(rows);
        }
        return list;
    }
}
