/**
 * @author wangpejian
 * @date 19-8-2 上午9:28
 */
public class N673_numberof_longest_increasing_subsequence {

    public static void main(String[] args) {

        Solution673 solution = new Solution673();

        int[] a = {2, 2, 2, 2, 2};

        System.out.println(solution.findNumberOfLIS(a));
    }
}

class Solution673 {

    public int findNumberOfLIS(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }

        Integer[] dp = new Integer[nums.length];
        Integer[] cache = new Integer[nums.length];
        int maxNum = 0;

        for (int i = 0; i < nums.length; i++) {

            int max = 1;
            int countMax = 1;
            int currentMax = 0;

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j]) {
                    // 当前项可组合出的最大距离 和 本次循环已生成的最大距离 大的为 本次循环的最大距离
                    max = Math.max(dp[j] + 1, max);

                    // 当前项 + 1 与当前最大距离相同，则最长距离可组合数加上 当前项的可组合数
                    if (currentMax == dp[j] + 1) {
                        countMax += cache[j];
                    } else if (currentMax < max) {
                        // 当前项的最大距离更新，将当前项的可组合距离设置为当前项缓存的可组合数
                        countMax = Math.max(cache[j], 1);
                        currentMax = max;
                    }
                }
            }

            dp[i] = max;
            maxNum = Math.max(maxNum, max);
            cache[i] = countMax;
        }


        int res = 0;
//        List<Integer> list = Arrays.asList(dp);
//        list.forEach(System.out::print);
//        System.out.println();

        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == maxNum) {
                res += cache[i];
            }
        }

//        List<Integer> list2 = Arrays.asList(cache);
//        list2.forEach(System.out::print);
//        System.out.println();

        return res;
    }
}
