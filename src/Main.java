/**
 * @author wangpejian
 * @date 19-9-9 下午1:58
 */
public class Main {

    public static void main(String[] args) {


        System.out.println(new Solution().Fibonacci(5));
    }

    static public class Solution {

        private int[] arr;

        public int Fibonacci(int n) {

            int len = n + 1 < 3 ? 3 : n + 1;

            this.arr = new int[len];
            this.arr[0] = 0;
            this.arr[1] = 1;
            this.arr[2] = 1;

            return getFi(3, n, this.arr);

        }

        public int getFi(int s, int e, int[] arr) {

            if (s > e) {
                return arr[e];
            }

            arr[s] = arr[s - 1] + arr[s - 2];
            return getFi(s + 1, e, arr);
        }
    }

}
