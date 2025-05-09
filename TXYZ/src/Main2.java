import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        char[] s = str.toCharArray();
        if (s[0] == '0') {
            System.out.println(1);
            return;
        }
        if (s[0] == '+') {
            System.out.println(0);
            return;
        }
        int p = 1;
        int len = str.length();
        int sum = 1;
        Map<Character, Boolean> map = new HashMap<>();
        map.put('+', true);
        map.put('-', true);
        map.put('0', true);
        map.put('1', true);
        map.put('2', true);
        map.put('3', true);
        map.put('4', true);
        map.put('5', true);
        map.put('6', true);
        map.put('7', true);
        map.put('8', true);
        map.put('9', true);
        while (p < len) {
            if (!map.containsKey(s[p])&&!map.containsKey(s[p-1])) {
                break;
            }
            if (s[p - 1] == '+' && s[p] == '+') {
                break;
            } else if (s[p - 1] == '+' && s[p] == '-') {
                break;
            } else if (s[p - 1] == '-' && s[p] == '+') {
                break;
            } else if (s[p - 1] == '-' && s[p] == '-') {
                break;
            } else if (s[p - 1] == '+' && s[p] == '0' && p != len - 1) {
                break;
            } else if (s[p - 1] == '-' && s[p] == '0' && p!=len-1) {
                break;
            } else {
                sum++;
            }
            p++;
        }
        if (s[p-1] == '+' || s[p-1] == '-') {
            sum--;
        }
        System.out.println(sum);
    }
}