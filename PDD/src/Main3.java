import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2025/4/9 19:40
 * @Version V1.0
 */
public class Main3 {

    public static String solve(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        // 将str2转成最大值
        Arrays.sort(str2);
        for (int i = 0; i < str2.length / 2; i++) {
            char temp = str2[i];
            str2[i] = str2[str2.length - 1 - i];
            str2[str2.length - 1 - i] = temp;
        }
        if (s1.length() > s2.length()) {
            return Arrays.toString(str2);
        }

        String res = "";
        boolean flag = true;
        for (int i = 0; i < str1.length && flag; i++) {
            int q1 = str1[i] - '0';
            for (int j = 0; j < str2.length; j++) {
                int q2 = str2[j] - '0';
                if (q2 == q1) {
                    res += str2[j];
                    str2[j] = '0';
                    break;
                }
                if (q2 < q1 && q2 > 0) {
                    flag = false;
                    res += str2[j];
                    str2[j] = '0';
                    break;
                }
            }
        }
        for (int i = 0; i < str2.length; i++) {
            if (str2[i] != '0') {
                res += str2[i];
            }
        }
        int compare = s2.compareTo(res);
        if (compare > 0) {
            return "-1";
        } else {
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int len1 = sc.nextInt();
            int len2 = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(solve(s2, s1));
        }
    }
}
