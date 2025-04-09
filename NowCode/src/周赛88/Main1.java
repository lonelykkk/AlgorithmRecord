package 周赛88;

import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/4/9 21:34
 * @Version V1.0
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a * b <= c) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
