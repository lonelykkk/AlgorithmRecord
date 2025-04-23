package leetcode.hot100;

/**
 * 124. 二叉树中的最大路径和
 *
 * 链接：
 * https://leetcode.cn/problems/binary-tree-maximum-path-sum/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 二叉树中的最大路径和 {
    int maxn = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxn;
    }

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftGain = Math.max(solve(root.left), 0);
        int rightFain = Math.max(solve(root.right), 0);

        int currGain = root.val + leftGain + rightFain;

        maxn = Math.max(maxn, currGain);
        return Math.max(leftGain, rightFain) + root.val;
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
