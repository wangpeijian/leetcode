/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N1_two_sum {

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        System.out.println(new Solution().twoSum(a, 9));
    }

    static class Solution {

        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] + nums[i] == target) {
                        return new int[]{j, i};
                    }

                }

            }

            return null;
        }

    }
}


