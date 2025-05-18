package leetcode.hot100;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/5/18 19:13
 * @Version V1.0
 */
public class 数组中的第K个最大元素 {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        // 1. 构建最小堆
        minHeap(nums, n);
        // 2. 逐个提取最小值并调整堆
        for (int i = n - 1; i > 0; i--) {
            // 交换堆顶（最小值）和当前最后一个元素
            swap(nums, 0, i);
            // 调整堆（范围缩小到 i）
            minHeap(nums, i);
        }
        return nums[k];
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void minHeap(int[] heap, int n) {
        int lastIndex = n - 1;
        int lastRoot = (n - 2) / 2;
        for (int i = lastRoot; i >= 0; --i) {
            int root = i;
            int temp = heap[root];
            int j = i * 2 + 1;
            while (j <= lastIndex) {
                if ( j < lastIndex && heap[j] > heap[j + 1]) {
                    j++;
                }
                if (temp <= heap[j]) {
                    break;
                } else {
                    heap[root] = heap[j];
                    root = j;
                    j = root * 2 + 1;
                }
            }
            heap[root] = temp;
        }
    }

    public static void main(String[] args) {
        int[] heap = new int[]{3,2,1,5,6,4};
        int n = heap.length;
        findKthLargest(heap, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println("\n" + heap[n - 2]);
    }
}
