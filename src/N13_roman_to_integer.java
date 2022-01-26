import java.util.HashMap;
import java.util.Map;

public class N13_roman_to_integer {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }

    static class Solution {
        static final private Map<Character, Integer> codeMap = new HashMap<>();

        static {
            codeMap.put('I', 1);
            codeMap.put('V', 5);
            codeMap.put('X', 10);
            codeMap.put('L', 50);
            codeMap.put('C', 100);
            codeMap.put('D', 500);
            codeMap.put('M', 1000);
        }

        public int romanToInt(String s) {
            int num = 0;

            for (int i = 0; i < s.length(); i++) {
                int cn = codeMap.get(s.charAt(i));
                int nn = 0;

                if (i != s.length() - 1) {
                    nn = codeMap.get(s.charAt(i + 1));
                }

                if (cn >= nn) {
                    num += cn;
                } else {
                    num += (nn - cn);
                    i++;
                }
            }

            return num;
        }
    }

}
