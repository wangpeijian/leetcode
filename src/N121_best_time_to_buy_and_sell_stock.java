/**
 * @author wangpejian
 * @date 19-9-10 上午9:40
 */
public class N121_best_time_to_buy_and_sell_stock {

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    static class Solution {

        public int maxProfit(int[] prices) {
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int price : prices) {

                if (price < min) {
                    min = price;
                } else if (price - min > max) {
                    max = price - min;
                }
            }

            return max;
        }
    }
}
