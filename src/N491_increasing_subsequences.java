import java.util.*;

/**
 * @author wangpejian
 * @date 19-8-1 下午3:40
 */

class N491_increasing_subsequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(new Solution3().findSubsequences(arr));
    }

    static class Solution3 {

        Set<List<Integer>> cache = new HashSet<>();

        public List<List<Integer>> findSubsequences(int[] nums) {

            List<Integer> arr = new ArrayList<>();
            findSuccessArr(0, nums, arr);

            return new ArrayList<>(cache);
        }

        void findSuccessArr(int start, int[] nums, List<Integer> arr) {

            for (int i = start; i < nums.length; i++) {

                if (arr.size() == 0) {
                    arr.add(nums[i]);
                    continue;
                }

                if (nums[i] >= arr.get(arr.size() - 1)) {
                    arr.add(nums[i]);

                    if (arr.size() >= 2) {
                        cache.add(new ArrayList<>(arr));
                        System.out.println(arr);
                    }

                    findSuccessArr(i, nums, new ArrayList<>());
                }

            }

        }
    }

    static class Solution {

        HashMap<String, List<Integer>> cache = new HashMap<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            List<Integer> num = new ArrayList<>();
            for (int s : nums) {
                num.add(s);
            }

            findSuccessArr(num);

            List<List<Integer>> res = new ArrayList<>();
            cache.forEach((s, integers) -> res.add(integers));
            return res;
        }

        void findSuccessArr(List<Integer> nums) {
            if (nums.size() < 2) {
                return;
            }
            if (cache.containsKey(getKey(nums))) {
                return;
            }

            nums = new ArrayList<>(nums);

            int len = nums.size();

            for (int i = 0; i < len; i++) {
                List<Integer> arr = new ArrayList<>();
                arr.add(nums.get(i));

                for (int j = i + 1; j < len; j++) {
                    int a = arr.get(arr.size() - 1);
                    int b = nums.get(j);


                    List<Integer> nextNums = new ArrayList<>(arr.subList(0, arr.size() - 1));
                    nextNums.addAll(nums.subList(j, nums.size()));

                    findSuccessArr(nextNums);
                    if (b >= a) {
                        arr.add(b);
                        cache.put(getKey(arr), new ArrayList<>(arr));
                    }
                }
            }
        }

        String getKey(List<Integer> list) {
            List<String> list2 = new ArrayList<>();
            list.forEach(integer -> list2.add(integer.toString()));
            return String.join(",", list2);
        }
    }

    static class Solution2 {
        Set<List<Integer>> res = new HashSet();

        public List<List<Integer>> findSubsequences(int[] nums) {
            helper(nums, 0, new ArrayList<Integer>());
            return new ArrayList(res);
        }

        public void helper(int[] nums, int idx, List<Integer> list) {

            System.out.println(list);

            if (list.size() >= 2) {
                List<Integer> tmp = new ArrayList();
                tmp.addAll(list);
                res.add(tmp);
            }
            for (int i = idx; i < nums.length; i++) {
                if (list.size() == 0 || nums[i] >= list.get(list.size() - 1)) {
                    list.add(nums[i]);
                    helper(nums, i + 1, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}

