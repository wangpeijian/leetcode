/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N11_container_with_most_waterjava {

    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(a));
    }

}

class Solution11 {

    public int maxArea(int[] height) {

        int max = 0;
        int curr = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {

                if (height[i] > height[j]) {
                    curr = height[j] * (j - i);
                } else {
                    curr = height[i] * (j - i);
                }

                max = curr > max ? curr : max;
            }

        }

        return max;
    }

}
