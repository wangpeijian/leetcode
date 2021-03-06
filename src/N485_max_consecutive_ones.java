/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N485_max_consecutive_ones {

    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1};
        System.out.println(new Solution().findMaxConsecutiveOnes(a));
    }

    static class Solution {

        public int findMaxConsecutiveOnes(int[] nums) {

            int max = 0;
            int curr = 0;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 1) {
                    curr++;
                } else {
                    max = curr > max ? curr : max;
                    curr = 0;
                }

            }

            max = curr > max ? curr : max;

            return max;
        }

    }

}

