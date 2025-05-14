package leetcode.hot100.二叉树;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/14 15:50
 * @Version V1.0
 */
public class 二叉树中的最大路径和 {
    int maxn = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxn;
    }

    public int solve(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLen = Math.max(solve(node.left), 0);
        int rightLen = Math.max(solve(node.right), 0);
        int sumLen = node.val + leftLen + rightLen;
        maxn = Math.max(maxn, sumLen);
        return Math.max(leftLen, rightLen) + node.val;
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
