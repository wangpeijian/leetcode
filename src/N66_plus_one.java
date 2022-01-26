import java.util.Arrays;

public class N66_plus_one {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9, 9, 9})));
    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int up = 1;
            int len = digits.length;
            for (int i = len - 1; i >= 0; i--) {
                digits[i] += up;
                up = 0;
                if (digits[i] >= 10) {
                    up = 1;
                    digits[i] -= 10;
                }
            }

            if (up == 0) {
                return digits;
            } else {
                int[] re = new int[len + 1];
                re[0] = 1;
                for (int i = 0; i < len; i++) {
                    re[i + 1] = digits[i];
                }

                return re;
            }
        }
    }

}
