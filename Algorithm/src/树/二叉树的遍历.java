package 树;

import java.util.List;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/4/8 20:24
 * @Version V1.0
 */
public class 二叉树的遍历 {

    /**
     * 中序遍历
     * @param root
     * @param list
     */
    public static void f1(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        f1(root.left, list);
        list.add(root.val);
        f1(root.right, list);
    }

    /**
     * 先序遍历
     * @param root
     * @param list
     */
    public static void f2(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        f2(root.left, list);
        f2(root.right, list);
    }
    /**
     * 后序遍历
     * @param root
     * @param list
     */
    public static void f3(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        f2(root.left, list);
        f2(root.right, list);
        list.add(root.val);
    }

    public static void main(String[] args) {

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
