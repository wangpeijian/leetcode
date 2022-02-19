// 返回倒数第 k 个节点 2022-02-19 23:25:08

//实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。 
//
// 注意：本题相对原题稍作改动 
//
// 示例： 
//
// 输入： 1->2->3->4->5 和 k = 2
//输出： 4 
//
// 说明： 
//
// 给定的 k 保证是有效的。 
// Related Topics 链表 双指针 
// 👍 94 👎 0


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
    int res = 0;
    int count = 0;

    public int kthToLast(ListNode head, int k) {
        count = k;
        deep(head);
        return res;
    }

    private void deep(ListNode head){
        if(head.next != null ){
            deep(head.next);
        }

        if(count == 1){
            res = head.val;
        }

        count--;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
