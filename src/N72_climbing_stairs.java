/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N72_climbing_stairs {

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(10));
    }

    static class Solution {
        int memo[];

        public int climbStairs(int n) {
            this.memo = new int[n + 1];
            return climb(n);
        }

        int climb(int i) {

            if (i < 0) {
                return 0;
            }

            if (i == 0) {
                return 1;
            }

            if (memo[i] > 0) {
                return memo[i];
            }

            memo[i] = climb(i - 1) + climb(i - 2);

            return memo[i];
        }

    }

}

