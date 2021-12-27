package sort;

public class HeapSort {

    public static void main(String[] args) {
        int[] a = {6, 1, 2, 6, 7, 9, 11, 4, 5, 10, 8};
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
            for (int i = 0; i < nums.length / 2; i++) {
                adjust(nums, 0, nums.length - 1);
            }

            // 2.每次循环将堆顶元素与尾节点交换,交换后对堆顶到尾结点-1的数据重新调整为大顶堆
            for (int i = nums.length - 1; i > 0; i--) {
                swap(nums, 0, i);
                adjust(nums, 0, i - 1);
            }
        }

        void adjust(int[] nums, int start, int end) {
            int l = start * 2 + 1;
            int r = (start + 1) * 2;

            if(l < nums.length){

            }

        }

        void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
