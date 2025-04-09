import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */
public class Main {

    public static String solve(String s) {
        s += "0";
        char[] chars = s.toCharArray();
        int len = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '0') {
                map.put(len, true);
                len = 0;
            } else {
                len++;
            }
        }
        if (map.containsKey(9)) {
            return "lucky";
        } else {
            return "unlucky";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int len = sc.nextInt();
            String s = sc.next();
            System.out.println(solve(s));
            t--;
        }
    }
}