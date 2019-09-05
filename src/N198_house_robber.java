/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N198_house_robber {

    public static void main(String[] args) {
        Solution198 solution = new Solution198();
        int[] a = {2, 7, 9, 99, 1, 1, 1};
        System.out.println(solution.rob(a));
    }

}

class Solution198 {


    public int rob(int[] nums) {


        int prevMax = 0;
        int currMax = 0;

        for (int num : nums) {

            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;


        }

        return currMax;
    }


}
