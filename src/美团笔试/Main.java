package 美团笔试;

import java.util.*;

public class Main {

    public static long solve2(long n, long m, long w2, long w3) {
        PriorityQueue<State> queue = new PriorityQueue<>(Comparator.comparingLong(s -> s.cost));
        queue.offer(new State(n, 0));
        Map<Long, Long> map = new HashMap<>();
        map.put(n, 0L);
        while (!queue.isEmpty()) {
            State current = queue.poll();
            if (current.value >= m) {
                return current.cost;
            }
            if (current.cost > map.getOrDefault(current.value, Long.MAX_VALUE)) {
                continue;
            }
            Long nextValue2 = current.value * 2;
            Long nextCost2 = current.cost + w2;
            if (!map.containsKey(nextValue2) || nextCost2 < map.get(nextValue2)) {
                map.put(nextValue2, nextCost2);
                queue.offer(new State(nextValue2, nextCost2));
            }

            Long nextValue3 = current.value * 3;
            Long nextCost3 = current.cost + w3;
            if (!map.containsKey(nextValue3) || nextCost2 < map.get(nextValue3)) {
                map.put(nextValue3, nextCost3);
                queue.offer(new State(nextValue3, nextCost3));
            }
        }
        return -1;
    }
    static class State{
        long value;
        long cost;

        public State(long value, long cost) {
            this.value = value;
            this.cost = cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextInt();
            long m = sc.nextInt();
            long w2 = sc.nextInt();
            long w3 = sc.nextInt();
            long res = solve2(n, m, w2, w3);
            System.out.println(res);
            t--;
        }
    }
}
