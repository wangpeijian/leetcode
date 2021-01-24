

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N9_palindrome_number {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }

    static class Solution {
//        暴力比较
//        public boolean isPalindrome(int x) {
//            String s = String.valueOf(x);
//            char[] chars = s.toCharArray();
//            for (int i = 0; i < chars.length / 2; i++) {
//                if (chars[i] != chars[chars.length - 1 - i]) {
//                    return false;
//                }
//            }
//
//            return true;
//        }

        //  数学计算
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            int k = x;
            int n = 0;
            while (k != 0) {
                n = n * 10 + k % 10;
                k = k / 10;
            }

            return n == x;
        }
    }
}


