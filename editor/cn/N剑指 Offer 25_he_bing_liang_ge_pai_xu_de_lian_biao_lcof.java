// 合并两个排序的链表 2022-02-13 17:23:44

//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
// Related Topics 递归 链表 
// 👍 206 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1 == null && l2 == null){
            return null;
        }

        ListNode res;
        if(l1.val <= l2.val){
            res = l1;
        }else {
            res = l2;
            l2 = l1;
            l1 = res;
        }

        ListNode p;
        while (true) {
            if (l1.next == null) {
                l1.next = l2;
                break;
            }

            if(l2 == null){
                break;
            }

            if(l1.next.val > l2.val){
                p = l2;
                l2 = l2.next;
                p.next = l1.next;
                l1.next = p;
            }else {
                l1 = l1.next;
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
