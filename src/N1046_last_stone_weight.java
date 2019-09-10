/**
 * @author wangpejian
 * @date 19-9-9 下午2:13
 */
public class N1046_last_stone_weight {

    public static void main(String[] args) {
        System.out.println(new Solution().lastStoneWeight(new int[]{3, 7, 2}));
    }

    static class Solution {
        public int lastStoneWeight(int[] stones) {

            if (stones.length == 1) {
                return stones[0];
            }

            int[] max;

            int index_1 = 0;
            int index_2 = 0;

            int w_1 = 0;
            int w_2 = 0;

            do {
                max = findMax(stones);
                index_1 = max[0];
                index_2 = max[1];

                w_1 = stones[index_1];
                w_2 = stones[index_2];

                System.out.println(String.format("最大： %s, %s", w_1, w_2));

                if (w_1 > w_2) {
                    stones[index_2] = 0;
                    stones[index_1] = w_1 - w_2;
                } else {
                    stones[index_1] = 0;
                    stones[index_2] = w_2 - w_1;
                }


            } while (w_1 != 0 && w_2 != 0);

            return Math.max(w_1, w_2);
        }

        public int[] findMax(int[] stones) {

            int max_1 = 0;
            int max_2 = 0;

            int n_1 = 0;
            int n_2 = 0;


            for (int i = 0; i < stones.length; i++) {
                int cur = stones[i];

                if (cur > max_1) {

                    if (max_1 > max_2) {
                        max_2 = max_1;
                        n_2 = n_1;
                    }

                    max_1 = cur;
                    n_1 = i;
                    continue;
                }

                if (cur >= max_2) {
                    max_2 = cur;
                    n_2 = i;
                    continue;
                }
            }

            return new int[]{n_1, n_2};
        }
    }
}
