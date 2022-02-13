// 替换空格 2022-02-13 00:28:44

//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 
// 👍 210 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        if (s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        char[] res = new char[(s.length()) * 3];

        int i = 0;
        for (char c : chars) {
            if (c == ' ') {
                res[i++] = '%';
                res[i++] = '2';
                res[i++] = '0';
            } else {
                res[i++] = c;
            }
        }

        //return new String(Arrays.copyOf(res, i));
        return String.copyValueOf(res, 0, i);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
