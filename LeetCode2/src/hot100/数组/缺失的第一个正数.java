package hot100.数组;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/13 19:08
 * @Version V1.0
 */
public class 缺失的第一个正数 {
    public int firstMissingPositive(int[] nums) {
        boolean[] flag = new boolean[100010];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] < flag.length) {
                flag[nums[i]] = true;
            }
        }
        for (int i = 1; i < flag.length; i++) {
            if (!flag[i]) {
                return i;
            }
        }
        return 0;
    }
}
