/**
 * @author wangpejian
 * @date 19-9-5 下午5:17
 */
public class N746_min_cost_climbing_stairs {

    public static void main(String[] args) {

        System.out.println(Solution.minCostClimbingStairs(new int[]{1, 0, 0, 0}));

    }

    static class Solution {

        static int[] cost;

        static int[] mk;

        static int minCostClimbingStairs(int[] cost) {
            Solution.cost = cost;
            mk = new int[cost.length];

            return Math.min(dp(0), dp(1));
        }

        static int dp(int i) {

            if (i >= cost.length) {
                return 0;
            }

            if (mk[i] != 0) {
                return mk[i];
            }

            mk[i] = Math.min(dp(i + 2), dp(i + 1)) + cost[i];

            return mk[i];
        }
    }
}




