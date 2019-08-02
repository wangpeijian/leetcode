import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wangpejian
 * @date 19-8-1 下午5:27
 */
public class N78_subsets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(new Solution78_2().subsets(arr));
    }
}

class Solution78_2 {

    Set<List<Integer>> ca = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {

        ca.add(new ArrayList<>());
        find(nums, new ArrayList<>(), 0);

        return new ArrayList<>(ca);
    }

    void find(int[] nums, ArrayList<Integer> integers, int ins) {
        System.out.println(integers);
        for (int i = ins; i < nums.length; i++) {
            integers.add(nums[i]);
            ca.add(new ArrayList<>(integers));
            find(nums, integers, i + 1);
            integers.remove(integers.size() - 1);
        }
    }
}

class Solution78 {

    Set<List<Integer>> ca = new HashSet<>();

    public List<List<Integer>> subsets(int[] nums) {

        ca.add(new ArrayList<>());

        int ins = 0;
        find(nums, new ArrayList<>(), ins);

        return new ArrayList<>(ca);
    }

    void find(int[] nums, ArrayList<Integer> integers, int ins) {

        for (int i = ins; i < nums.length; i++) {

            integers.add(nums[i]);
            ca.add(new ArrayList<>(integers));

            ArrayList<Integer> newList = new ArrayList<>(integers);
            newList.remove(newList.size() - 1);

            find(nums, newList, i + 1);
        }

    }
}
