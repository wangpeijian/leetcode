// 从尾到头打印链表 2022-02-13 17:15:03

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 栈 递归 链表 双指针 
// 👍 234 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    int[] arr = new int[0];

    public int[] reversePrint(ListNode head) {

        if(head != null){
            print(head, 1);
        }

        return arr;
    }

    private void print(ListNode node, int len){

        if(node.next == null){
            arr = new int[len];
        }else {
            print(node.next, len + 1);
        }

        arr[arr.length - len] = node.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
