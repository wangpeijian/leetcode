/**
 * @author wangpejian
 * @date 19-9-10 下午2:25
 */
public class N303_range_sum_query_immutable {

    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{1, 2, 3, 4});
        int param_1 = obj.sumRange(0, 3);
        System.out.println(param_1);
    }


    static class NumArray {

        private static int[] nums;

        public NumArray(int[] nums) {
            NumArray.nums = nums;
        }

        public int sumRange(int i, int j) {

            int sum = 0;
            while (i <= j) {
                sum += NumArray.nums[i];
                i++;
            }

            return sum;
        }
    }
}

