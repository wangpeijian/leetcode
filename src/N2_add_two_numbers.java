/**
 * @author wangpejian
 * @date 19-8-2 上午10:32
 */
public class N2_add_two_numbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(7, new ListNode(0, new ListNode(8)));
        System.out.println(new Solution().addTwoNumbers(l1, l2));
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            return addTwoNumbers(l1, l2, 0);
        }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2, int lastUpNum) {

            if (l1 == null && l2 == null) {
                if (lastUpNum != 0) {
                    return new ListNode(1);
                }

                return null;
            }

            if (l1 == null) {
                l1 = new ListNode(0);
            }

            if (l2 == null) {
                l2 = new ListNode(0);
            }

            int upNum = 0;


            int val = l1.val + l2.val + lastUpNum;
            if (val >= 10) {
                val = val - 10;
                upNum = 1;
            }

            return new ListNode(val, addTwoNumbers(l1.next, l2.next, upNum));
        }
    }

    static class ListNode {
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
}


