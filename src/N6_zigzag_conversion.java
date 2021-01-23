import java.util.Arrays;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N6_zigzag_conversion {

    public static void main(String[] args) {
        System.out.println(new Solution().convert("Abc", 1));
    }

    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }

            int cycle = numRows * 2 - 1;
            char[] chars = s.toCharArray();

            StringBuilder sb = new StringBuilder();

            int right = 0;
            for (int i = 0; i < numRows; i++) {
                if (i == 0 || i == numRows - 1) {
                    right = i;
                } else {
                    right = cycle - i - 1;
                }

                for (int j = 0; ; j++) {
                    if (i + j * (cycle - 1) < chars.length) {
                        sb.append(chars[i + j * (cycle - 1)]);
                    } else {
                        break;
                    }

                    if (i != right && right + j * (cycle - 1) < chars.length) {
                        sb.append(chars[right + j * (cycle - 1)]);
                    }

                }
            }

            return sb.toString();
        }
    }
}


