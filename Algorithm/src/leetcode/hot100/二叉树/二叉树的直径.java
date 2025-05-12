package leetcode.hot100.二叉树;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/12 21:12
 * @Version V1.0
 */
public class 二叉树的直径 {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return ans - 1;
    }

    public int solve(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLen = solve(node.left);
        int rightLen = solve(node.right);
        ans = Math.max((leftLen + rightLen) + 1, ans);
        return Math.max(rightLen, leftLen) + 1;
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
