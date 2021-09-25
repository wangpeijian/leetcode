/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N88_merge_sorted_array {

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {1};
        int m = -1;
        int n = -1;
        new Solution().merge(nums1, m, nums2, n);
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m + n - 1;

            m--;
            n--;

            while (n >= 0) {
                nums1[i--] = m >= 0 && (nums1[m] > nums2[n]) ? nums1[m--] : nums2[n--];
            }
        }
    }
}


