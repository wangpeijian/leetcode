/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N26_remove_duplicates_from_sorted_array {

    public static void main(String[] args) {
        int[] a = {-1, 0, 0, 1, 1, 2, 4, 4};
        System.out.println(new Solution().removeDuplicates(a));
    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int p2 = 0;

            for (int p1 = 0; p1 < nums.length; p1++) {

                if (p1 != nums.length - 1) {
                    if (nums[p1] == nums[p1 + 1]) {
                        continue;
                    }
                }

                nums[p2] = nums[p1];
                p2++;
            }

            return p2;
        }
    }
}


