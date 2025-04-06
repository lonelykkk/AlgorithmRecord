package 算法扩展;

import java.util.Scanner;

/**
 * 最小堆
 */
public class 最小堆 {

    public static void minHeap(int[] heap,int n) {
        int lastIndex = n - 1; // 最后一个叶子节点
        int lastRoot = (n - 2) / 2; // 最后一个根节点
        for (int i = lastRoot; i >= 0; i--) { //遍历所有非叶子节点，直到遍历到根节点
            int temp = heap[i]; // 记录根节点
            int root = i;
            int j = i * 2 + 1; // 记录左节点
            while (j <= lastIndex) { //保证不超过最后一个叶子节点
                if ((j + 1) <= lastIndex && heap[j] > heap[j + 1]) {
                    j++; // 如果右节点小于左节点，则将右节点与根节点进行比较
                }
                if (temp <= heap[j]) {
                    break; // 如果根节点小于子节点，符合最小堆，直接返回
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
