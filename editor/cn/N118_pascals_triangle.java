// 杨辉三角 2022-01-29 14:44:36

//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
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
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics 数组 动态规划 
// 👍 676 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> group = new ArrayList<>();

        int l;
        int r;
        List<Integer> lastLine;
        for (int i = 0; i < numRows; i++) {

            List<Integer> line = new ArrayList<>();

            if (i == 0) {
                line.add(1);
            } else {
                l = 0;
                r = 1;

                line.add(1);
                lastLine = group.get(i - 1);
                int len = lastLine.size();
                for (int j = 0; j < len; j++) {
                    if (r < len) {
                        line.add(lastLine.get(l) + lastLine.get(r));

                        l++;
                        r++;
                    }
                }

                line.add(1);
            }

            group.add(line);
        }

        return group;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
