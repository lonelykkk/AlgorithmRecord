package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 *
 * 链接：
 * https://leetcode.cn/problems/subsets/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 子集 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }
}
