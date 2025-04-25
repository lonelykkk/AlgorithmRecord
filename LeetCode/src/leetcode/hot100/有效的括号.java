package leetcode.hot100;

import java.util.*;

/**
 * 20. 有效的括号
 * 链接：
 * https://leetcode.cn/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 有效的括号 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (int i = 0; i < len; i++) {
            char str = s.charAt(i);
            if (map.containsKey(str)) { // 如果是左括号，那么栈顶必须是对应的右括号
                if (stack.isEmpty() || !stack.peek().equals(map.get(str))) {
                    return false;
                }
                stack.pop();
            } else {
                // 如果是右括号，入栈
                stack.push(str);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "()";
        System.out.println(new 有效的括号().isValid(s));

    }
}
