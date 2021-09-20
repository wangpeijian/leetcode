/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N14_longest_common_prefix {

    public static void main(String[] args) {
        String[] a = {"flower", "flow", "flight"};
        System.out.println(new Solution().longestCommonPrefix(a));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            char[] a = strs[0].toCharArray();

            String longest = "";
            int j = 0;
            for (char i : a) {
                for (int i1 = 1; i1 < strs.length; i1++) {


                    if (strs[i1].length() - 1 < j) {
                        return longest;
                    }

                    if (strs[i1].charAt(j) != i) {
                        return longest;
                    }
                }

                j++;
                longest = strs[0].substring(0, j);
            }

            return longest;
        }
    }
}


