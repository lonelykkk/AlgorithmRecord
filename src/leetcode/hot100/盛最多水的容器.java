package leetcode.hot100;

import static java.lang.Math.*;

/**
 * 11. 盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 *
 * 链接：
 * https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int l = 1, r = height.length;
        int maxn = 0;
        while (l != r) {
            maxn = max(maxn, (r - l) * (min(height[l], height[r])));
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxn;
    }
}
