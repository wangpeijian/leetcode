// 各位相加 2022-02-10 00:40:51

//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。 
//
// 
//
// 示例 1: 
//
// 
//输入: num = 38
//输出: 2 
//解释: 各位相加的过程为：
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2
//由于 2 是一位数，所以返回 2。
// 
//
// 示例 1: 
//
// 
//输入: num = 0
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= num <= 231 - 1 
// 
//
// 
//
// 进阶：你可以不使用循环或者递归，在 O(1) 时间复杂度内解决这个问题吗？ 
// Related Topics 数学 数论 模拟 
// 👍 400 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 数学上提到：
     *
     * 1.能够被9整除的整数，各位上的数字加起来也必然能被9整除，所以，连续累加起来，最终必然就是9。
     * 2.不能被9整除的整数，各位上的数字加起来，结果对9取模，和初始数对9取摸，是一样的，
     * 所以，连续累加起来，最终必然就是初始数对9取摸。
     *
     * int addDigits(int num)
     * {
     *     if(0 == num % 9)
     *     {
     *         return 9;
     *     }
     *     return num % 9;
     * }
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {

        int n = num;
        while (n >= 10){

            n = 0;
            while (num > 0){
                n += num % 10;
                num = num / 10;
            }

            num = n;

        }

        return n;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
