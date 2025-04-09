package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 101. 对称二叉树
 *
 * 链接：
 * https://leetcode.cn/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 对称二叉树 {


    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }


    /**
     * 中序遍历再判断回文
     * @param root
     * @param list
     */
    public void f1(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(-1);
            return;
        }
        f1(root.left, list);
        list.add(root.val);
        f1(root.right, list);
    }
    public boolean isSymmetric1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        f1(root, list);
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            if (list.get(l) != list.get(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
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
