// 字符串轮转 2022-02-10 11:36:22

//字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。 
//
// 示例1: 
//
//  输入：s1 = "waterbottle", s2 = "erbottlewat"
// 输出：True
// 
//
// 示例2: 
//
//  输入：s1 = "aa", s2 = "aba"
// 输出：False
// 
//
// 
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 100000]范围内。 
// 
//
// 说明: 
//
// 
// 你能只调用一次检查子串的方法吗？ 
// 
// Related Topics 字符串 字符串匹配 
// 👍 97 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isFlipedString(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.length() == 0) {
            return true;
        }

        int p1 = 0;
        int p2 = 0;
        int loop = 0;
        while (true) {
            if (s1.charAt(p1) != s2.charAt(p2)) {
                loop++;
                p2++;
                p1 = 0;

                if (loop == s2.length()) {
                    return false;
                }

            } else {
                p1++;
                p2++;

                if (p1 == s1.length()) {
                    return true;
                }

                if (p2 == s2.length()) {
                    p2 = 0;
                }
            }


        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
