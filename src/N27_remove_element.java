import java.util.Arrays;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N27_remove_element {

    public static void main(String[] args) {
        int[] a = {4, 4, -1, 0, 0, 1, 1, 2, 5};
        System.out.println(new Solution().removeElement(a, 1));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != val){
                    nums[j++] = nums[i];
                }
            }

            return j;
        }
    }
}


