// 顺时针打印矩阵 2022-02-13 17:48:42

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 矩阵 模拟 
// 👍 354 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }

        int xl = matrix.length;
        int yl = matrix[0].length;
        int len = xl * yl;
        int[] arr = new int[len];

        int x = 0;
        int y = 0;
        int step = 0;

        int xx = xl - 1;
        int yx = yl - 1;
        int xm = 1;
        int ym = 0;

        for (int i = 0; i < len; i++) {
            arr[i] = matrix[x][y];
            switch (step % 4) {
                case 0:
                    y++;
                    if (y > yx) {
                        yx--;
                        y--;
                        x++;
                        step++;
                    }
                    break;
                case 1:
                    x++;
                    if (x > xx) {
                        xx--;
                        x--;
                        y--;
                        step++;
                    }
                    break;
                case 2:
                    y--;
                    if (y < ym) {
                        ym++;
                        y++;
                        x--;
                        step++;
                    }
                    break;
                case 3:
                    x--;
                    if (x < xm) {
                        xm++;
                        x++;
                        y++;
                        step++;
                    }
                    break;
            }
        }

        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
