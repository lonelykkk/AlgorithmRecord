package leetcode.hot100.二叉树;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/13 19:37
 * @Version V1.0
 */
public class 验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return solve(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean solve(TreeNode node, long minn, long maxn) {
        if (node == null) {
            return true;
        }
        if (node.val <= minn || node.val >= maxn) {
            return false;
        }
        return solve(node.left, minn, node.val) && solve(node.right, node.val, maxn);
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
