package 美团笔试;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class Main2 {

    public static int solve(int n) {
        int count = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> primes = Primes(n);
        for (int i = 0; i < primes.size(); i++) {
            for (int j = i; j < primes.size(); j++) {
                if (primes.get(i) * primes.get(j) <= n) {
                    int key = primes.get(i) * primes.get(j);
                    if (!map.containsKey(key)) {
                        map.put(key, true);
                        count++;
                    }

                }
            }
        }
        return count;
    }

    public static List<Integer> Primes(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println(res);
    }
}
