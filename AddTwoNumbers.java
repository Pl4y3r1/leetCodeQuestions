/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val;
        int val1 = l1.val;
        int val2 = l2.val;
        int carry = 0;
        ListNode next1;
        ListNode next2;
        ListNode solution;
        ListNode current = new ListNode();

        val = val1 + val2;

        if(val > 9){
            carry = 1;
            val = val - 10;
        }

        solution = new ListNode(val);

        next1 = l1.next;
        next2 = l2.next;

        if(next1 != null || next2 != null){
            solution.next = current;
        }

        while(next1 != null || next2 != null){
            if(next1 != null){
                val1 = next1.val;
            } else {
                val1 = 0;
            }

            if(next2 != null){
                val2 = next2.val;
            } else {
                val2 = 0;
            }

            val = val1 + val2;

            if(carry > 0){
                val += carry;
                carry = 0;
            }

            if(val > 9){
                carry = 1;
                val = val - 10;
            }
            current.val = val;

            if(next1 != null && next1.next != null){
                current.next = (new ListNode());
                current = current.next;
            } else if(next2 != null && next2.next != null){
                current.next = (new ListNode());
                current = current.next;
            }
            
            if(next1 != null){
                next1 = next1.next;
            }
            if(next2 != null){
                next2 = next2.next;
            }
        }

        if(carry > 0){
            if(solution.next == null){
                solution.next = new ListNode(carry);
            } else{
                current.next = new ListNode(carry);
            }
        }

        return solution;
    }
}
