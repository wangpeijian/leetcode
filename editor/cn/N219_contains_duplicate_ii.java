// 存在重复元素 II 2022-02-09 23:36:52

//给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i 
//- j) <= k 。如果存在，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3,1], k = 3
//输出：true 
//
// 示例 2： 
//
// 
//输入：nums = [1,0,1,1], k = 1
//输出：true 
//
// 示例 3： 
//
// 
//输入：nums = [1,2,3,1,2,3], k = 2
//输出：false 
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// 0 <= k <= 105 
// 
// Related Topics 数组 哈希表 滑动窗口 
// 👍 441 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //for (int i = 0; i < nums.length; i++) {
        //
        //    for (int n = 1; n <= k; n++) {
        //        if(i + n < nums.length && nums[i] == nums[i + n]){
        //            return true;
        //        }
        //    }
        //}
        //
        //return false;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if(i - k - 1 >= 0){
                set.remove(nums[i - k - 1]);
            }

            if(!set.add(nums[i])){
                return true;
            }
        }

        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
