/**
 * @author wangpejian
 * @date 19-9-4 下午4:14
 */
public class N206_reverse_linked_list {

    public static void main(String[] args) {
        N206_reverse_linked_list.Solution.ListNode node = new Solution.ListNode(1);
        node.next = new Solution.ListNode(2);
        node.next.next = new Solution.ListNode(3);

        System.out.println(new Solution().reverseList(node));
    }

    static class Solution {
        /**
         * Definition for singly-linked list.
         */
        public static class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }


        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode n = head.next;
            head.next = null;

            if (n.next != null) {
                ListNode re = reverseList(n);
                n.next = head;

                return re;
            } else {
                n.next = head;
                return n;
            }

        }
    }
}

