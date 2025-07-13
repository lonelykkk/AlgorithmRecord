package hot100.数组;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/13 18:52
 * @Version V1.0
 */
public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[(len + k + i) % len] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[i] = res[i];
        }
    }
}
