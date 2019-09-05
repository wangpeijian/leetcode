/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N198_house_robber {

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(new Solution().rob(a));
    }

    static class Solution {

        private int[] nums;

        private int[] mk;

        public int rob(int[] nums) {
            this.nums = nums;
            this.mk = new int[nums.length];

            int sum = 0;

            for (int i = 0; i < nums.length; i++) {

                sum = getN(i);

            }

            return sum;
        }

        private int getN(int i) {

            if (i < 0) {
                return 0;
            }

            if (mk[i] != 0) {
                return mk[i];
            }

            mk[i] = Math.max(getN(i - 1), nums[i] + getN(i - 2));

            return mk[i];
        }

    }
}


