package leetcode;

import java.util.*;

/**
 * 380. O(1) 时间插入、删除和获取随机元素
 * 实现RandomizedSet 类：
 *
 * RandomizedSet() 初始化 RandomizedSet 对象
 * bool insert(int val) 当元素 val 不存在时，向集合中插入该项，并返回 true ；否则，返回 false 。
 * bool remove(int val) 当元素 val 存在时，从集合中移除该项，并返回 true ；否则，返回 false 。
 * int getRandom() 随机返回现有集合中的一项（测试用例保证调用此方法时集合中至少存在一个元素）。每个元素应该有 相同的概率 被返回。
 * 你必须实现类的所有函数，并满足每个函数的 平均 时间复杂度为 O(1) 。
 */
class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> mp;
    Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        mp = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (mp.containsKey(val)) {
            return false;
        }
        int index = list.size();
        list.add(val);
        mp.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        if (!mp.containsKey(val)) {
            return false;
        }
        Integer index = mp.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        list.remove(list.size() - 1);

        mp.put(last, index);
        mp.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */