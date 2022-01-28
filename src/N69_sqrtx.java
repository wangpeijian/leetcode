public class N69_sqrtx {

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(4));
    }

    static class Solution {
        public int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }

            long max = x;
            long min = 1;
            long n;
            while (max - min > 1) {
                n = (max + min) / 2;
                if ((n * n) > x) {
                    max = n;
                } else if ((n * n) <= x) {
                    min = n;
                }
            }

            return (int) min;
        }

        public int mySqrt1(int x) {
            int step = 1;

            while ((x >> step++) > 1) {

            }

            long n = 1 << ((step - 1) / 2);

            while (true) {

                if ((n * n) == x) {
                    break;
                }

                if ((n * n) > x && ((n - 1) * (n - 1)) < x) {
                    n = n - 1;
                    break;
                }

                if ((n * n) > x) {
                    n--;
                    continue;
                }

                if ((n * n) < x) {
                    n += 100;
                    continue;
                }
            }

            return (int) n;
        }
    }

}
