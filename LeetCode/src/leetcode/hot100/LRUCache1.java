package leetcode.hot100;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU 缓存
 *
 * 链接：
 * https://leetcode.cn/problems/lru-cache/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class LRUCache1 extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache1(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
