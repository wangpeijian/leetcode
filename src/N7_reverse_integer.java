

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N7_reverse_integer {

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-2147483648));
    }

    static class Solution {
        public int reverse(int x) {
            String s;
            if (x < 0) {
                s = String.valueOf(x).substring(1);
            } else {
                s = String.valueOf(x);
            }

            char[] chars = s.toCharArray();
            char index;
            for (int i = 0; i < chars.length / 2; i++) {
                index = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = index;
            }

            long res = Long.parseLong(new String(chars));

            res = x < 0 ? -res : res;

            return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
        }
    }
}


