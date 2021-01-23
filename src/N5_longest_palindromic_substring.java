import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N5_longest_palindromic_substring {

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("cabcac"));
    }

    static class Solution {
        char[] chars;
        String ss;

        public String longestPalindrome(String s) {
            chars = s.toCharArray();
            ss = s;

            if (chars.length == 1) {
                return s;
            }

            int max = 0;
            String res = "";
            for (int i = 0; i < chars.length; i++) {
                String a = spread(i, i);
                String b = spread(i, i + 1);

                if (a.length() > max) {
                    max = a.length();
                    res = a;
                }

                if (b.length() > max) {
                    max = b.length();
                    res = b;
                }
            }


            return res;
        }

        private String spread(int left, int right) {
            int i = 0;
            int l = 0;
            int r = 0;
            while (left - i >= 0 && right + i <= chars.length - 1) {

                if (chars[left - i] == chars[right + i]) {
                    l = left - i;
                    r = right + i;
                } else {
                    break;
                }

                i++;
            }

            return ss.substring(l, r + 1);
        }
    }
}


