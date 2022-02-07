// 多数元素 2022-02-07 23:37:05

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：[2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//
// 进阶： 
//
// 
// 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
// 
// Related Topics 数组 哈希表 分治 计数 排序 
// 👍 1294 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 计数法
    //public int majorityElement(int[] nums) {
    //    Map<Integer, Integer> map = new HashMap<>();
    //
    //    int max = Integer.MIN_VALUE;
    //    int maxKey = 0;
    //
    //    for (int i = 0; i < nums.length; i++) {
    //        int val =  map.compute(nums[i], (k, v) -> {
    //            if (v == null) {
    //                return 1;
    //            } else {
    //                return v+1;
    //            }
    //        });
    //
    //        map.put(nums[i], val);
    //
    //        if(val > max){
    //            max = val;
    //            maxKey = nums[i];
    //        }
    //    }
    //
    //    return maxKey;
    //}

    // 摩尔投票
    // 投票算法证明：
    // 1.如果候选人不是maj,则 maj,会和其他非候选人一起反对候选人,所以候选人一定会下台(maj==0时发生换届选举)
    // 2.如果候选人是maj,则maj,会支持自己,其他候选人会反对,同样因为maj票数超过一半,所以maj一定会成功当选
    public int majorityElement(int[] nums) {
        int maxKey = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                maxKey = num;
            }

            count += (maxKey == num) ? 1 : -1;
        }

        return maxKey;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
