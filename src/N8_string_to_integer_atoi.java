

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N8_string_to_integer_atoi {

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("42"));
    }

    static class Solution {
        public int myAtoi(String s) {
            char[] chars = s.toCharArray();

            boolean begin = false;
            int positive = 1;
            int l = -1;
            int r = -1;
            boolean hasNum = false;
            char ch;
            for (int i = 0; i < chars.length; i++) {
                ch = chars[i];

                // 去除先导空格
                if (ch == ' ') {
                    if (begin) {
                        break;
                    }

                } else if (ch == '-') {
                    if (begin) {
                        break;
                    } else {
                        begin = true;
                        positive = -1;
                        hasNum = true;
                    }
                } else if (ch == '+') {
                    if (begin) {
                        break;
                    } else {
                        begin = true;
                        positive = +1;
                        hasNum = true;
                    }
                } else if (ch >= '0' && ch <= '9') {
                    if (l == -1) {
                        l = i;
                    }
                    if (ch == '0' && !hasNum) {
                        begin = true;
                        continue;
                    }

                    hasNum = true;

                    if (begin) {
                        r = i;
                    } else {
                        begin = true;
                        l = i;
                        r = i;
                    }
                } else {
                    break;
                }
            }

            if (l == -1 || r == -1) {
                return 0;
            }

            int res;

            try {
                res = Integer.parseInt(s.substring(l, r + 1)) * positive;
                return res;
            } catch (Exception e) {
                if (positive == -1) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }
    }
}


