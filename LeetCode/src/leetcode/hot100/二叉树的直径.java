package leetcode.hot100;

/**
 * 543. 二叉树的直径
 *
 * 链接：
 * https://leetcode.cn/problems/diameter-of-binary-tree/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 二叉树的直径 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        solve(root);
        return ans - 1;
    }

    public int solve(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLen = solve(node.left);
        int rightLen = solve(node.right);
        ans = Math.max(leftLen + rightLen + 1, ans);
        return Math.max(leftLen, rightLen) + 1;
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
