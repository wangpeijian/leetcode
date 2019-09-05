/**
 * @author wangpejian
 * @date 19-8-2 上午9:28
 */
public class N300_longest_increasing_subsequence {

    public static void main(String[] args) {

        int[] a = {4, 10, 4, 3, 8, 9};

        System.out.println(new Solution().lengthOfLIS(a));
    }

    static class Solution {

        public int lengthOfLIS(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }

            int max = 0;

            int[] dp = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {

                    if (nums[i] > nums[j]) {
                        max = Math.max(dp[j] + 1, max);
                    }

                }

                dp[i] = Math.max(max, 1);
                max = 0;
            }

            for (int aDp : dp) {
                max = Math.max(max, aDp);

                System.out.println(aDp);
            }


            return max;
        }
    }

}

