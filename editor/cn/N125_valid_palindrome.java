// 验证回文串 2022-01-29 23:20:45

//给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。 
//
// 说明：本题中，我们将空字符串定义为有效的回文串。 
//
// 
//
// 示例 1: 
//
// 
//输入: "A man, a plan, a canal: Panama"
//输出: true
//解释："amanaplanacanalpanama" 是回文串
// 
//
// 示例 2: 
//
// 
//输入: "race a car"
//输出: false
//解释："raceacar" 不是回文串
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 105 
// 字符串 s 由 ASCII 字符组成 
// 
// Related Topics 双指针 字符串 
// 👍 468 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int numMin = (int) '0';
    int numMax = (int) '9';
    int wordMin = (int) 'a';
    int wordMax = (int) 'z';

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;
        while (true) {
            while (l < arr.length - 1 && !available(arr[l])){
                l++;
            }

            while (r > 0 && !available(arr[r])){
                r--;
            }

            if(l == r || l > r){
                return true;
            }

            if(arr[l] != arr[r]){
                return false;
            }

            l++;
            r--;
        }
    }

    private boolean available(char c) {
        int ci = (int) c;
        if (numMin <= ci && ci <= numMax) {
            return true;
        } else if (wordMin <= ci && ci <= wordMax) {
            return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
