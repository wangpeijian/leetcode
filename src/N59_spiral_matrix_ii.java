import java.util.Arrays;

/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N59_spiral_matrix_ii {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(new Solution().generateMatrix(n)));
    }

    static class Solution {
        public int[][] generateMatrix(int n) {
            int max = n * n;

            int i = 0;
            int j = 0;

            int dire = 0;

            int[][] res = new int[n][n];


            for (int k = 1; k <= max; k++) {

                switch (dire) {
                    case 0:
                        // 右移

                        res[i][j] = k;

                        if (j == n - 1 || res[i][j + 1] != 0) {
                            i++;
                            dire++;
                        } else {
                            j++;
                        }

                        break;
                    case 1:
                        // 下移

                        res[i][j] = k;

                        if (i == n - 1 || res[i + 1][j] != 0) {
                            j--;
                            dire++;
                        } else {
                            i++;
                        }

                        break;
                    case 2:
                        // 左移

                        res[i][j] = k;

                        if (j == 0 || res[i][j - 1] != 0) {
                            i--;
                            dire++;
                        } else {
                            --j;
                        }

                        break;
                    case 3:
                        // 上移

                        res[i][j] = k;

                        if (i == 0 || res[i - 1][j] != 0) {
                            j++;
                            dire = 0;
                        } else {
                            --i;
                        }

                        break;
                }

            }


            return res;
        }
    }
}


