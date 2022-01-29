// 杨辉三角 II 2022-01-29 15:13:19

//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
// Related Topics 数组 动态规划 
// 👍 359 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    public List<Integer> getRow(int rowIndex) {
        int[] arr = new int[rowIndex + 1];

        int i = 0;
        int tmp;
        while (i <= rowIndex){
            tmp = 1;
            for(int colunm = 0; colunm <= i; colunm++){
                if(colunm == 0){
                    arr[colunm] = 1;
                }else {
                    arr[colunm] = tmp +  arr[colunm];
                    tmp = arr[colunm] - tmp;
                }
            }
            i++;
        }

        List<Integer> list = new ArrayList();
        for (int value : arr) {
            list.add(value);
        }
        return list;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
