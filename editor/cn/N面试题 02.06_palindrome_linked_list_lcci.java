// 回文链表 2022-02-10 15:15:26

//编写一个函数，检查输入的链表是否是回文的。 
//
// 
//
// 示例 1： 
//
// 输入： 1->2
//输出： false 
// 
//
// 示例 2： 
//
// 输入： 1->2->2->1
//输出： true 
// 
//
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 栈 递归 链表 双指针 
// 👍 91 👎 0


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
    ListNode p = null;
    boolean flag = true;

    public boolean isPalindrome(ListNode head) {
        p = head;
        revert(head);
        return flag;
    }

    private int revert(ListNode node){
        if(node == null){
            return 0;
        }

        if(node.next != null){
            int  value  = revert(node.next);

            if(p.val != value){
                flag = false;
            }

            p = p.next;
        }

        return node.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
