package leetcode.hot100;

/**
 * 98. 验证二叉搜索树
 *
 * 链接：
 * https://leetcode.cn/problems/validate-binary-search-tree/description/?envType=study-plan-v2&envId=top-100-liked
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
