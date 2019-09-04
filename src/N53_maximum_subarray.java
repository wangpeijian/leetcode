/**
 * @author wangpejian
 * @date 19-9-4 下午4:14
 */
public class N53_maximum_subarray {

    public static void main(String[] args) {
        Solution53 solution = new Solution53();
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(a));
    }

}

class Solution53 {
    public int maxSubArray(int[] nums) {
        // 保存最大的结果
        int result = nums[0];
        // 保存当前的子序和
        int sum = 0;

        for (int num : nums) {
            // sum是正数，意味着后面有机会再创新高，可以继续加
            if (sum > 0) {
                sum += num;
            } else {
                // sum是负的，还不如直接从当前位重新开始算，也比(负数+当前值)要大吧
                sum = num;
            }

            // 每一步都更新最大值
            result = Math.max(result, sum);
        }

        return result;

    }
}