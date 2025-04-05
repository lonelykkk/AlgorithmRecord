package test;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("请输入数字（输入非数字结束）:");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        if (numbers.isEmpty()) {
            System.out.println("没有输入任何数字！");
        } else {
            int max = Collections.max(numbers);
            System.out.println("数组中的最大值是: " + max);
        }
    }
}