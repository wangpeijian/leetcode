import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N20_valid_parentheses {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("[{("));
    }


    static class Solution {
        public boolean isValid(String s) {
            int l = s.length();

            if (l % 2 == 1) {
                return false;
            }

            List<Character> stack = new ArrayList<>();
            for (int i = 0; i < l; i++) {
                char c = s.charAt(i);
                if (c == '{' || c == '(' || c == '[') {
                    stack.add(c);
                } else {

                    if (stack.size() == 0) {
                        return false;
                    }

                    char e = stack.remove(stack.size() - 1);

                    if (c == '}' && e != '{') {
                        return false;
                    } else if (c == ')' && e != '(') {
                        return false;
                    } else if (c == ']' && e != '[') {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }
}


