package leetcode.hot100.二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/14 10:43
 * @Version V1.0
 */
public class 路径总和III {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, 1);
        return rootSum(root, 0L, map, targetSum);
    }

    public int rootSum(TreeNode root,Long curr, Map<Long, Integer> map,int targetSum) {
        if (root == null) {
            return 0;
        }
        int ret = 0;
        curr += root.val;
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
