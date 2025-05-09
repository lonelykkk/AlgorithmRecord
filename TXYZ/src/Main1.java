import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main1 {
    public static int minn = Integer.MAX_VALUE;
    static char[] answer = "AcMer".toCharArray();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int p = 0;
        int len = str.length();
        while (p <= len - 5) {
            String s = str.substring(p, p + 5);
            solve(s);
            p++;
        }
        System.out.println(minn);
    }

    public static void solve(String s) {
        int score = 0;
        char[] ss = s.toCharArray();
        if (ss[0] != answer[0]) {
            if (ss[0] >= 'a' && ss[0] <= 'z' && ss[0] != 'a') {
                score += 10;
            } else {
                score += 5;
            }
        }
        if (ss[1] != answer[1]) {
            if (ss[1] >= 'A' && ss[1] <= 'Z' && ss[1] != 'C') {
                score += 10;
            } else {
                score += 5;
            }
        }
        if (ss[2] != answer[2]) {
            if (ss[2] >= 'a' && ss[2] <= 'z' && ss[2] != 'm') {
                score += 10;
            } else {
                score += 5;
            }
        }
        if (ss[3] != answer[3]) {
            if (ss[3] >= 'A' && ss[3] <= 'Z' && ss[3] != 'E') {
                score += 10;
            } else {
                score += 5;
            }
        }
        if (ss[4] != answer[4]) {
            if (ss[4] >= 'A' && ss[4] <= 'Z' && ss[4] != 'R') {
                score += 10;
            } else {
                score += 5;
            }
        }
        minn = Math.min(minn, score);
    }
}