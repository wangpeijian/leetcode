// 判定是否互为字符重排 2022-02-10 09:18:39

//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 哈希表 字符串 排序 
// 👍 57 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Integer, Integer> map1 = getCharMap(s1);
        Map<Integer, Integer> map2 = getCharMap(s2);

        if (map1.keySet().size() != map2.keySet().size()) {
            return false;
        }

        for (Integer key : map1.keySet()) {
            Integer n1 = map1.get(key);
            Integer n2 = map2.get(key);
            if (n2 == null) {
                return false;
            }

            if (n1 != n2) {
                return false;
            }

        }

        return true;
    }

    private Map<Integer, Integer> getCharMap(String s) {
        Map<Integer, Integer> map = new HashMap<>();

        char[] arr = s.toCharArray();
        for (int c : arr) {
            Integer num = map.get(c);

            if (num == null) {
                num = 0;
            }

            map.put(c, ++num);
        }

        return map;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
