/**
 * @author wangpejian
 * @date 19-9-10 下午2:06
 */
public class N1025_divisor_game {

    public static void main(String[] args) {
        System.out.println(new Solution().divisorGame(2));
    }

    static class Solution {
        public boolean divisorGame(int N) {
            return N % 2 == 0;
        }
    }
}
