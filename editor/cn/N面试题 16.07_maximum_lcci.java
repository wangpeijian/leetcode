// 最大数值 2022-02-19 23:35:33

//编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。 
// 示例： 
// 输入： a = 1, b = 2
//输出： 2
// 
// Related Topics 位运算 脑筋急转弯 数学 
// 👍 107 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximum(int a, int b) {
        double x = a;
        double y = b;

        double abs = Math.sqrt(Math.pow(x - y, 2));

        return (int) ((abs + x + y) / 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
