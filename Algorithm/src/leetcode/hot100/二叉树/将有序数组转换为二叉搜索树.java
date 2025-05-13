package leetcode.hot100.二叉树;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/13 19:07
 * @Version V1.0
 */
public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return merge(nums, 0, nums.length - 1);
    }

    public TreeNode merge(int[] nums, int left, int right) {
        if (left >= right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = merge(nums, left, mid - 1);
        root.right = merge(nums, mid + 1, right);
        return root;
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
