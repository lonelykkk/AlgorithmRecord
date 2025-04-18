package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 114. 二叉树展开为链表
 *
 * 链接：
 * https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 二叉树展开为链表 {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preTree(root, list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode pre = list.get((i - 1));
            TreeNode curr = list.get(i);
            pre.left = null;
            pre.right = curr;
        }
    }

    public void preTree(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            preTree(root.left, list);
            preTree(root.right, list);
        }
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
