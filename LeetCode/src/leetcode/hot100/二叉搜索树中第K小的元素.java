package leetcode.hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 230. 二叉搜索树中第 K 小的元素
 *
 * 链接：
 * https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 二叉搜索树中第K小的元素 {

    public void f1(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        f1(node.left, list);
        list.add(node.val);
        f1(node.right, list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        f1(root, list);
        return list.get(k-1);
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
