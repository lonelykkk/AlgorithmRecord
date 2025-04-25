package leetcode.hot100;

/**
 * 208. 实现 Trie (前缀树)
 *
 * 链接：https://leetcode.cn/problems/implement-trie-prefix-tree/description/?envType=study-plan-v2&envId=top-100-liked
 *
 */
class Trie {
    private int[][] e;
    private int[] flag;
    int idx;

    public Trie() {
        e = new int[100000][26];
        flag = new int[100000];
        idx = 0;
    }

    public void insert(String word) {
        int p = 0;
        char[] words = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int k = words[i] - 'a'; //记录当前层次的位置
            if (e[p][k] == 0) {
                e[p][k] = ++idx;
            }
            p = e[p][k];
        }
        // 记录当前单词结束的位置
        flag[p]++;
    }

    public boolean search(String word) {
        int p = 0;
        char[] words = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            int k = words[i] - 'a';
            if (e[p][k] == 0) {
                return false;
            }
            p = e[p][k];
        }
        if (flag[p] == 0) {
            return false;
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        int p = 0;
        char[] words = prefix.toCharArray();
        for (int i = 0; i < prefix.length(); i++) {
            int k = words[i] - 'a';
            if (e[p][k] == 0) {
                return false;
            }
            p = e[p][k];
        }
        return true;
    }
}
