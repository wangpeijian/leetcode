/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N35_search_insert_position {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = -1;
        System.out.println(new Solution().searchInsert(nums, target));
    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            return doSearch(nums, target, 0, nums.length);
        }

        public int doSearch(int[] nums, int target, int start, int end) {

            if (start == end) {
                return start;
            } else if (end - start == 1) {

                if (nums[start] >= target) {
                    return start;
                } else {
                    return end;
                }
            }

            int i = (end + start) / 2;


            if (nums[i] > target) {
                return doSearch(nums, target, start, i);
            } else if (nums[i] < target) {
                return doSearch(nums, target, i, end);
            } else {
                return i;
            }
        }
    }
}


