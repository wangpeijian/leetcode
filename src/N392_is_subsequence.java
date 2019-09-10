/**
 * @author wangpejian
 * @date 19-9-9 下午3:10
 */
public class N392_is_subsequence {

    public static void main(String[] args) {

        System.out.println("123456".substring(2));

        System.out.println(new Solution().isSubsequence("leeeeetcode", "leeeeeetcode"));
    }

    static class Solution {
        public boolean isSubsequence(String s, String t) {

            String[] charts = s.split("");

            int index = 0;

            for (String chart : charts) {

                int cur = t.indexOf(chart, index);

                if (cur < index) {
                    return false;
                }

                index = cur + 1;
            }

            return true;
        }
    }
}
