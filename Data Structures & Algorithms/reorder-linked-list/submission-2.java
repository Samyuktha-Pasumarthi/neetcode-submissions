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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null){
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;

        }
        ListNode first = head;
        ListNode last = prev;

        while(last!=null){
            ListNode temp = first.next;
            ListNode temp1 = last.next;
            first.next = last;
            last.next = temp;
            first = temp;
            last = temp1;
            


        }
        
    }
}
