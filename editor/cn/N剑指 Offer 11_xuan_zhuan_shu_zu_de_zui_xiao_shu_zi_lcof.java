// 旋转数组的最小数字 2022-02-13 16:52:59

//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
//
// 给你一个可能存在 重复 元素值的数组 numbers ，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。请返回旋转数组的最小元素。例如，数组 [3
//,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 
//输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 
//输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sor
//ted-array-ii/ 
// Related Topics 数组 二分查找 
// 👍 513 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {

        if(numbers.length == 1){
            return numbers[0];
        }

        int i = 1;
        while (i < numbers.length){
            if(numbers[i-1] > numbers[i]){
                return numbers[i];
            }else {
                i++;
            }
        }

        if(numbers[0] > numbers[numbers.length - 1]){
            return numbers[numbers.length - 1];
        }

        if(numbers[0] < numbers[numbers.length - 1]){
            return numbers[0];
        }

        return numbers[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
