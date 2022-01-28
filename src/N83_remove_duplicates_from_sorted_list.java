import java.util.HashSet;
import java.util.Set;

public class N83_remove_duplicates_from_sorted_list {

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

    public static void main(String[] args) {
        ListNode l2 = new ListNode(1);
        ListNode l1 = new ListNode(1, l2);
        ListNode head = new ListNode(1, l1);

        ListNode c = new Solution().deleteDuplicates(head);
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            Set<Integer> set = new HashSet<>();

            ListNode p = head;
            ListNode c = head;

            while (c != null) {

                if (set.contains(c.val)) {
                    p.next = c.next;
                }else {
                    set.add(c.val);
                    p = c;
                }
                c = c.next;
            }

            return head;
        }
    }

}
