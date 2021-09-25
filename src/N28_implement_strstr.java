/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N28_implement_strstr {

    public static void main(String[] args) {
        String haystack = "mis";
        String needle = "s";
        System.out.println(new Solution().strStr(haystack, needle));
    }

    static class Solution {
        public int strStr(String haystack, String needle) {
            if ("".equals(needle)) {
                return 0;
            }

            if (needle.length() > haystack.length()) {
                return -1;
            }

            int j = 0;
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    if (j == needle.length() - 1) {
                        return i - j;
                    }

                    j++;
                } else {
                    i -= j;
                    j = 0;
                }
            }

            return -1;
        }
    }
}


