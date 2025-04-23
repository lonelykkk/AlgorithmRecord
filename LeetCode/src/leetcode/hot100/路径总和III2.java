package leetcode.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 437. 路径总和 III - 前缀和
 *
 * 链接：
 * https://leetcode.cn/problems/path-sum-iii/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 路径总和III2 {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return rootSum(root, 0L, map, targetSum);
    }

    public int rootSum(TreeNode root, Long curr, Map<Long, Integer> map, int targetSum) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        curr += root.val; // 当前节点的前缀和
        ret = map.getOrDefault(curr - targetSum, 0);
        map.put(curr, map.getOrDefault(curr, 0) + 1);

        ret += rootSum(root.left, curr, map, targetSum);
        ret += rootSum(root.right, curr, map, targetSum);
        map.put(curr, map.getOrDefault(curr, 0) - 1);
        return ret;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
