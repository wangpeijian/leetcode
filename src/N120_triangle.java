import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author wangpejian
 * @date 19-9-9 下午3:35
 */
public class N120_triangle {

    public static void main(String[] args) {


        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(1));
        triangle.add(Arrays.asList(2, 3));

//        triangle.add(Arrays.asList(2));
//        triangle.add(Arrays.asList(3,4));
//        triangle.add(Arrays.asList(5,6,7));
//        triangle.add(Arrays.asList(4,1,8,3));

//        triangle.add(Arrays.asList(-1));
//        triangle.add(Arrays.asList(2, 3));
//        triangle.add(Arrays.asList(1, -1, -3));

        System.out.println(new Solution().minimumTotal(triangle));
    }


    static class Solution {

        static List<List<Integer>> triangle;
        static HashMap<Integer, HashMap<Integer, Integer>> ch = new HashMap<>();

        public int minimumTotal(List<List<Integer>> tr) {
            triangle = tr;
            return doDp(0, 0);
        }

        static int doDp(int i, int line) {

            HashMap<Integer, Integer> lin = ch.computeIfAbsent(line, k -> new HashMap<>());

            if (lin.get(i) != null) {
                return lin.get(i);
            }

            List<List<Integer>> triangle = Solution.triangle;


            if (triangle.size() <= line) {
                return 0;
            }

            List<Integer> list = triangle.get(line);

            if (i < 0) {
                i = 0;
            }

            if (list.size() <= i) {
                i = list.size() - 1;
            }

            int num = triangle.get(line).get(i);

            int res = Math.min(num + doDp(i, line + 1), num + doDp(i + 1, line + 1));
            lin.put(i, res);


            System.out.println(String.format("第 %s 行 当前值 = %s res = %s", line, num, res));

            return res;
        }
    }

}
