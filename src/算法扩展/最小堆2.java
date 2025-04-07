package 算法扩展;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/4/7 10:22
 * @Version V1.0
 */
public class 最小堆2 {

    public static void minHeap(int[] heap, int n) {
        int lastIndex = n - 1;
        int lastRoot = (n - 2) / 2;
        for (int i = lastRoot; i >= 0; i--) {
            int root = i;
            int temp = heap[root];
            int j = i * 2 + 1;
            while (j <= lastIndex) {
                if ((j + 1) <= lastIndex && heap[j] > heap[j + 1]) {
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
        int[] heap = new int[]{24, 22, 17, 23, 5, 4, 67, 68};
        int n = heap.length;
        minHeap(heap, n);
        for (int i = 0; i < n; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
