import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N46_permutations {

    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 3, 4}));
    }


    static class Solution {
        public List<List<Integer>> permute(int[] nums) {
            int size = nums.length;

            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                res.addAll(get(nums, i));
            }

            return res;
        }

        public List<List<Integer>> get(int[] nums, int i) {

            List<List<Integer>> res = new ArrayList<>();
            res.add(Collections.singletonList(nums[i]));
            List<Integer> cu = Arrays.stream(nums).boxed().collect(Collectors.toList());
            cu.remove(i);

            return new ArrayList<>(choose(res, cu));
        }

        public List<List<Integer>> choose(List<List<Integer>> old, List<Integer> not) {

            if (not.size() == 0) {
                return old;
            }

            List<List<Integer>> res = new ArrayList<>();

            for (int j = 0; j < not.size(); j++) {
                List<List<Integer>> line = new ArrayList<>();

                for (List<Integer> li : old) {
                    List<Integer> li2 = new ArrayList(li);
                    Collections.copy(li2, li);
                    li2.add(not.get(j));
                    line.add(li2);
                }

                List<Integer> notnew = new ArrayList(not);
                Collections.copy(notnew, not);
                notnew.remove(j);

                List<List<Integer>> cc = choose(line, notnew);

                res.addAll(cc);
            }

            return res;
        }

    }

}


