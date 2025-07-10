package hot100.双指针;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/7/10 8:36
 * @Version V1.0
 */
public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxn = 0;
        for (int i = 0; i < height.length; i++) {
            maxn = Math.max(maxn, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxn;
    }
}
