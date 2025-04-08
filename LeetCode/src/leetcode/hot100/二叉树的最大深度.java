package leetcode.hot100;

/**
 * 二叉树的最大深度
 */
public class 二叉树的最大深度 {
    public static int maxn = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        return Math.max(a, b);
    }

    public void f1(TreeNode root, int len) {
        if (root == null) {
            maxn = Math.max(maxn, len);
            return;
        }
        f1(root.left, len + 1);
        f1(root.right, len + 1);
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
