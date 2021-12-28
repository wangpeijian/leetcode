package sort;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = {20, 50, 20, 40, 70, 10, 80, 30, 60};
        new HeapSort.Solution().sortMe(a);

        for (int i : a) {
            System.out.print(i);
            System.out.print(",");
        }

    }

    static class Solution {
        public void sortMe(int[] nums) {
            sortTest(nums, 0, nums.length - 1);
        }

        void sortTest(int[] nums, int start, int end) {

            // 1.先将堆调整为大顶堆
            for (int i = nums.length / 2 - 1; i >= 0; i--) {
                adjust(nums, i, nums.length);
            }

            // 2.每次循环将堆顶元素与尾节点交换,交换后对堆顶到尾结点-1的数据重新调整为大顶堆
            for (int i = nums.length - 1; i > 0; i--) {
                swap(nums, 0, i);
                adjust(nums, 0, i);
            }
        }

        void adjust(int[] nums, int start, int end) {
            for (int i = start; (i >= 0) && ((i * 2 + 1) <= end); ) {
                int l = i * 2 + 1;
                int r = (i + 1) * 2;

                int p = l;
                if (r <= end && nums[r] > nums[l]) {
                    p = r;
                }

                if (p < end && nums[i] < nums[p]) {
                    swap(nums, i, p);
                } else {
                    // 没发生交换,说明子节点都比当前节点小
                    break;
                }

                i = p;
            }
        }

        void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
