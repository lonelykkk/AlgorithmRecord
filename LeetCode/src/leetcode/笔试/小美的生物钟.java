package leetcode.笔试;

import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/3/30 18:29
 * @Version V1.0
 */
public class 小美的生物钟 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t >= 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println(new 小美的生物钟().solve(n, k, a));
            t--;
        }
    }
    public String solve(int n, int k, int[] a) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < k) {
                int t = k - a[i];
                num += t;
            } else {
                int t = a[i] - k;
                num -= t;
            }
            if (num < 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
