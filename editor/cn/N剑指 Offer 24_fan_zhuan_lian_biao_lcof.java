// 反转链表 2022-02-10 23:41:22

//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。 
//
// 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 206 题相同：https://leetcode-cn.com/problems/reverse-linked-list/ 
// Related Topics 递归 链表 
// 👍 369 👎 0


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

    public ListNode reverseList(ListNode head) {
        if (head != null) {
           return reverse(head);
        }
        return head;
    }

    private ListNode reverse(ListNode node) {
        ListNode res = node;
        if (node.next != null) {
            res = reverse(node.next);
            node.next.next = node;
            node.next = null;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
