package sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {6, 1, 2, 6, 7, 9, 11, 4, 5, 10, 8};
        new QuickSort.Solution().sortMe(a);

        for (int i : a) {
            System.out.print(i);
            System.out.print(",");
        }

    }

    static class Solution {

        public void sortMe(int[] nums) {
            sortTest(nums, 0, nums.length - 1);
        }

        void sort(int[] nums, int start, int end) {
            if (start >= end) {
                return;
            }

            int key = nums[start];
            int l = start;
            int r = end;

            while (l < r) {

                while (nums[r] >= key && r > l) {
                    r--;
                }

                while (nums[l] <= key && l < r) {
                    l++;
                }

                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;

//                prinum(nums);
            }

            nums[start] = nums[l];
            nums[l] = key;

//            prinum(nums);

            sort(nums, start, l - 1);
            sort(nums, l + 1, end);
        }

        void sortMe(int[] nums, int start, int end) {
            System.out.println(String.format("start: %s end: %s", start, end));

            if (start >= end) {
                return;
            }

            int key = nums[start];
            int l = start;
            int r = end;

            while (l < r) {

                for (; r > l; r--) {
                    if (nums[r] < key) {
                        break;
                    }
                }

                for (; l < r; l++) {
                    if (nums[l] > key) {
                        break;
                    }
                }

                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }

            nums[start] = nums[l];
            nums[l] = key;

            sortMe(nums, start, l - 1);
            sortMe(nums, l + 1, end);
        }

        void sortTest(int[] nums, int start, int end) {

            if (start >= end) {
                return;
            }

            int k = nums[start];
            int l = start;
            int r = end;

            while (l < r) {

                while (nums[r] > k && l < r) {
                    r--;
                }

                while (nums[l] <= k && l < r) {
                    l++;
                }

                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;

            }

            nums[start] = nums[l];
            nums[l] = k;

            sortTest(nums, start, l - 1);
            sortTest(nums, l + 1, end);
        }
    }

}
