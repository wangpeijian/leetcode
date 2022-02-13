// 第一个只出现一次的字符 2022-02-14 00:01:37

//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例 1: 
//
// 
//输入：s = "abaccdeff"
//输出：'b'
// 
//
// 示例 2: 
//
// 
//输入：s = "" 
//输出：' '
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
// Related Topics 队列 哈希表 字符串 计数 
// 👍 175 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int i : chars) {
            if (map.containsKey(i)) {
                map.put(i, -1);
            } else {
                map.put(i, index);
            }
            index++;
        }

        char c = ' ';
        int min = chars.length;
        for (int k : map.keySet()) {
            int inx = map.get(k);
            if (inx != -1 && inx < min) {
                c = (char) k;
                min = inx;
            }
        }

        return c;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
