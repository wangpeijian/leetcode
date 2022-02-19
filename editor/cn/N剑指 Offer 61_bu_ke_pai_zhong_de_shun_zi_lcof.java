// 扑克牌中的顺子 2022-02-19 23:04:24

//从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，
//可以看成任意数字。A 不能视为 14。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,4,5]
//输出: True 
//
// 
//
// 示例 2: 
//
// 
//输入: [0,0,1,2,5]
//输出: True 
//
// 
//
// 限制： 
//
// 数组长度为 5 
//
// 数组的数取值为 [0, 13] . 
// Related Topics 数组 排序 
// 👍 201 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 'A':
                    nums[i] = 1;
                    break;
                case 'J':
                    nums[i] = 11;
                    break;
                case 'Q':
                    nums[i] = 12;
                    break;
                case 'K':
                    nums[i] = 13;
                    break;
            }
        }

        boolean res = true;
        Arrays.sort(nums);

        int m = 0;
        int pre = -1;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];

            if (c == 0) {
                m++;
                continue;
            }

            if (pre == -1) {
                pre = c;
                continue;
            }

            if (c == pre) {
                res = false;
                break;
            }

            m -= c - 1 - pre;

            if(m < 0){
                res = false;
                break;
            }

            pre = c;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
