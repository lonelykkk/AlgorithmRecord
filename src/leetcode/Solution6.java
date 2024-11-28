package leetcode;

import java.util.Arrays;

/**
 * 274. H 指数
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 *
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
 * 并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
 */
class Solution6 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int[] arr = new int[citations.length];
        for (int i = 0, j = citations.length; i < citations.length; i++,j--) {
            arr[i] = j;
        }
        for (int i = 0; i <citations.length; i++) {
            if (citations[i] >= arr[i]) {
                h = arr[i];
                return h;
            }
        }
        return h;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,3};
        System.out.println(new Solution6().hIndex(arr));
    }
}