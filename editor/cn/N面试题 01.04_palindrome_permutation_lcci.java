// 回文排列 2022-02-12 23:25:16

//给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 
//
// 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。 
//
// 回文串不一定是字典当中的单词。 
//
// 
//
// 示例1： 
//
// 输入："tactcoa"
//输出：true（排列有"tacocat"、"atcocta"，等等）
// 
//
// 
// Related Topics 位运算 哈希表 字符串 
// 👍 67 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPermutePalindrome(String s) {
        // 偶数长度则所有字符都是偶数
        // 奇数长度,则仅有一个字符是奇数,其余都是偶数

        Long heigh = 0L;
        Long low = 0L;

        char[] arr = s.toCharArray();
        for (int i : arr) {
            if (i >= 64) {
                heigh ^= 1L << i - 64;
            } else {
                low ^= 1L << i;
            }
        }

        return Long.bitCount(heigh) + Long.bitCount(low) <= 1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
