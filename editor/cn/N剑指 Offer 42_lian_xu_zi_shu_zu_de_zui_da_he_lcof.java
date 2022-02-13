// 连续子数组的最大和 2022-02-13 18:06:51

//输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。 
//
// 要求时间复杂度为O(n)。 
//
// 
//
// 示例1: 
//
// 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^5 
// -100 <= arr[i] <= 100 
// 
//
// 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/ 
//
// 
// Related Topics 数组 分治 动态规划 
// 👍 459 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            max = Math.max(pre, max);
        }

        return max;
    }

    //public int maxSubArray(int[] nums) {
    //    map = new Integer[nums.length][nums.length];
    //    deep(nums, 0, 0);
    //    return max;
    //}

    //Integer[][] map;
    //int max = Integer.MIN_VALUE;

    //private int deep(int[] nums, int start, int end) {
    //
    //    if (end > nums.length - 1) {
    //        return Integer.MIN_VALUE;
    //    }
    //
    //    if (start > end) {
    //        return Integer.MIN_VALUE;
    //    }
    //
    //    Integer num = map[start][end];
    //    if (num == null) {
    //        num = 0;
    //        for (int i = start; i <= end; i++) {
    //            if(map[start][i] != null){
    //                num = map[start][i];
    //            }else {
    //                num += nums[i];
    //                map[start][i] = num;
    //            }
    //        }
    //    }
    //
    //    int add = deep(nums, start, end + 1);
    //    int rem = deep(nums, start + 1, end);
    //
    //    max = Math.max(max, add);
    //    max = Math.max(max, rem);
    //    max = Math.max(max, num);
    //
    //    return num;
    //}
}
//leetcode submit region end(Prohibit modification and deletion)
