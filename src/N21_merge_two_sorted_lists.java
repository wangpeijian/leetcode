/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N21_merge_two_sorted_lists {

    public static void main(String[] args) {
        System.out.println(new Solution().mergeTwoLists(null, null));
    }


    static class Solution {
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         * int val;
         * ListNode next;
         * ListNode() {}
         * ListNode(int val) { this.val = val; }
         * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         * }
         */

        public class ListNode {
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

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode listNode;

            if (l1 == null && l2 == null) {
                return null;
            } else if (l1 == null) {
                return l2;
            } else if (l2 == null) {
                return l1;
            }

            if (l1.val < l2.val) {
                listNode = l1;
                l1 = l1.next;
            } else {
                listNode = l2;
                l2 = l2.next;
            }

            ListNode currentNode = listNode;
            for (; ; ) {

                if (l1 == null) {
                    currentNode.next = l2;
                    break;
                }

                if (l2 == null) {
                    currentNode.next = l1;
                    break;
                }

                if (l1.val < l2.val) {
                    currentNode.next = l1;
                    l1 = l1.next;
                } else {
                    currentNode.next = l2;
                    l2 = l2.next;
                }

                currentNode = currentNode.next;

            }


            return listNode;
        }
    }
}


