/**
 * @author wangpejian
 * @date 19-9-4 下午4:14
 */
public class N237_delete_node_in_a_linked_list {

    public static void main(String[] args) {
        N237_delete_node_in_a_linked_list.Solution.ListNode node = new Solution.ListNode(1);
        node.next = new Solution.ListNode(2);

        new Solution().deleteNode(node);
    }

    static class Solution {
        /**
         * Definition for singly-linked list.
         */
        public static class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }


        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}

