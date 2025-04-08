package 输入练习;

import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/4/8 19:59
 * @Version V1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        int len = 0;
        while (sc.hasNextInt()) {
            arr[len++] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
