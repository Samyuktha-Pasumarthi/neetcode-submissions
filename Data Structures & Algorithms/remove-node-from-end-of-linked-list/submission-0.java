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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> array = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            array.add(node);
            node = node.next;
        }
        int delete = array.size()-n;
        if (delete == 0){
            return head.next;
        }
        array.get(delete-1).next = array.get(delete).next;
        return head;
    }
}
