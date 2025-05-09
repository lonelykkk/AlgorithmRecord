import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date ${DATE} ${TIME}
 * @Version V1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        long count = 1;
        while (n > 0) {
            count *= n;
            n--;
        }
        // System.out.println(count);
        int[] res = new int[10];
        while (count > 0) {
            int c = (int) (count % 10);
            res[c]++;
            count /= 10;
        }
        System.out.println(res[0]);
    }
}