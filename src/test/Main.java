package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();
        String ans = sc.next();
        int index = url.indexOf("?");
        String s = url.substring(index+1);
        Map<String, String> res = new HashMap<>();
        int i = 1;
        while (true) {
            int index1 = s.indexOf("=", 1);
            int index2 = s.indexOf("&", 1);
            if (index1 == -1) {
                break;
            }
            String key = s.substring(0, index1);
            String value = "";
            if (index2 != -1) {
                value = s.substring(index1 + 1, index2);
            } else {
                value = s.substring(index1 + 1);
            }

            res.put(key, value);
            if (index2 != -1) {
                s = s.substring(index2 + 1);
            } else {
                break;
            }
        }
        System.out.println(res.get(ans));
    }
}
