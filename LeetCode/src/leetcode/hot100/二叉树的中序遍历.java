package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * 链接：
 * https://leetcode.cn/problems/binary-tree-inorder-traversal/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        f1(root, list);
        return list;
    }

    public void f1(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        f1(root.left, res);
        res.add(root.val);
        f1(root.right, res);
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
