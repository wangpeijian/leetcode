/**
 * @author wangpejian
 * @date 19-9-4 下午4:14
 */
public class N344_reverse_string {

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};
        new Solution().reverseString(a);
        System.out.println(a);
    }

    static class Solution {
        public void reverseString(char[] s) {
            int le = s.length - 1;
            int siz = s.length / 2;
            char re;
            for (int i = 0; i < siz; i++) {
                re = s[i];
                s[i] = s[le - i];
                s[le - i] = re;
            }
        }
    }
}

