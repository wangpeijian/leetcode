// 最小的k个数 2022-02-11 09:19:06

//输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。 
//
// 
//
// 示例 1： 
//
// 输入：arr = [3,2,1], k = 2
//输出：[1,2] 或者 [2,1]
// 
//
// 示例 2： 
//
// 输入：arr = [0,1,2,1], k = 1
//输出：[0] 
//
// 
//
// 限制： 
//
// 
// 0 <= k <= arr.length <= 10000 
// 0 <= arr[i] <= 10000 
// 
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 
// 👍 360 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        //quickSort(arr, 0, arr.length - 1);
        heapSort(arr);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    boolean init = true;

    private void heapSort(int[] arr) {
        // 先调整一次,只调整前一半
        adjust(arr, 0, arr.length - 1);

        init = false;

        int end = arr.length - 1;
        while (end != 0) {
            // 循环取出头结点,放入队尾已排序的部分
            swap(arr, 0, end--);

            // 重新调整堆
            adjust(arr, 0, end);
        }
    }

    private void adjust(int[] arr, int n, int end) {
        if(n >= end){
            return;
        }

        int l = 2 * n + 1;
        int r = 2 * n + 2;

        if(l > end && r > end){
            return;
        }

        if(init){
            if(l < end){
                // 左节点在排序范围内,则先排序左树
                adjust(arr, l, end);
            }

            if(r < end){
                // 右节点在排序范围内,则先排序右树
                adjust(arr, r, end);
            }
        }

        int p = l;
        // 左右子树都是排序好的,根据 n, l, r 选出最大结点作为 n
        if(r <= end){
            // 右节点在范围内,则先比较左右结点最大值,再比较n
            if(arr[r] > arr[l]){
                p = r;
            }
        }

        if(arr[p] > arr[n]){
            swap(arr, n, p);
            adjust(arr, p, end);
        }
    }

    private void quickSort(int[] arr, int start, int end) {
        int l = start;
        int r = end;

        if (l >= r) {
            return;
        }

        int p = arr[start];

        while (l < r) {

            while (l < r && arr[r] >= p) {
                r--;
            }

            while (l < r && arr[l] <= p) {
                l++;
            }

            swap(arr, l, r);
        }

        swap(arr, start, l);

        quickSort(arr, start, l - 1);
        quickSort(arr, l + 1, end);
    }

    private void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
