package leetcode.笔试;

import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/3/31 14:33
 * @Version V1.0
 */
public class 回文时间 {
    public int huiWen(String time) {
        int res = 0;
        char[] chars = time.toCharArray();
        int h1 = chars[0] - '0';
        int h2 = chars[1] - '0';
        int hh = h1 * 10 + h2;
        int m1 = chars[3] - '0';
        int m2 = chars[4] - '0';
        int mm = m1 * 10 + m2;
        if (h2 >= 6) {
            res = (10-h2) * 60 + 60 - mm;
            return res;
        }
        // 代表应该要回文的数
        int hh2 = h2 * 10 + h1;
        if (hh2 < mm) {
            // 说明当前一个小时内无法达到回文了，需要进入下一个小时
            res = 60 - mm;
            if (hh == 23) {
                return res;
            }
            res += hh2 + 1;
        } else {
            res = hh2 - mm;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        System.out.println(new 回文时间().huiWen(time));
    }
}
