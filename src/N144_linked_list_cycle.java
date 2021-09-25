/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N144_linked_list_cycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode head = new ListNode(2, new ListNode(3, new ListNode(4, tail)));
        tail.next = head;

        System.out.println(new Solution().hasCycle(head));
    }

    static class Solution {
        public boolean hasCycle(ListNode head) {
            if (head != null) {
                ListNode p1 = head;
                ListNode p2 = head;

                while (p1.next != null && p2.next != null && p2.next.next != null) {

                    p1 = p1.next;
                    p2 = p2.next.next;

                    if(p1 == p2){
                        return true;
                    }

                }
            }

            return false;
        }
    }
}


