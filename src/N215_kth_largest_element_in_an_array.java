import java.util.PriorityQueue;

/**
 * @author wangpejian
 * @date 19_8_2 上午10:32
 */
public class N215_kth_largest_element_in_an_array {

    public static void main(String[] args) {
        int[] a = {-1, 2, 0};
        System.out.println(new Solution().findKthLargest(a, 2));
    }

    static class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue = new PriorityQueue<>();

            for (int num : nums) {
                if(queue.size() < k){
                    queue.add(num);
                }else if(queue.peek() < num){
                    queue.poll();
                    queue.add(num);
                }
            }


            return queue.peek();
        }
    }

    /*static class Solution {
        public int findKthLargest(int[] nums, int k) {
            int[] map = new int[10001];
            int[] map2 = new int[10000];

            for (int n : nums) {
                if (n >= 0) {
                    int count = map[n];
                    count++;
                    map[n] = count;
                } else {
                    int count = map2[-n];
                    count++;
                    map2[-n] = count;
                }
            }


            int sum = 0;
            for (int i = map.length - 1; i >= 0; i--) {
                sum += map[i];

                if (sum >= k) {
                    return i;
                }
            }

            for (int i = 0; i < map2.length - 1; i++) {
                sum += map2[i];

                if (sum >= k) {
                    return -i;
                }
            }

            return 0;
        }
    }*/
}


