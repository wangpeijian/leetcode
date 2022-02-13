// 打印从1到最大的n位数 2022-02-13 17:55:26

//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
// Related Topics 数组 数学 
// 👍 186 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] printNumbers(int n) {
        if(n == 0){
            return new int[0];
        }

        int num = 0;
        int p = 0;
        while (p < n){
            num += Math.pow(10, p++) * 9;
        }

        int i = 1;
        int[] res = new int[num];
        for (int j = 0; j < num; j++) {
            res[j] = i++;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
