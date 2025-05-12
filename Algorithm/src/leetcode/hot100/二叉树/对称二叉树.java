package leetcode.hot100.二叉树;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/12 20:57
 * @Version V1.0
 */
public class 对称二叉树 {

    public boolean solve(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && solve(p.left, q.right) && solve(p.right, q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left, root.right);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
