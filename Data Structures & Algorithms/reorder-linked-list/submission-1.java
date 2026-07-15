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
        head = rec(head,head.next);
        
    }
    public ListNode rec(ListNode root, ListNode cur){
        if(cur == null){
            return root;
        }

        root = rec(root,cur.next);
        if(root == null){
            return null;
        }
        ListNode temp = null;
        if(cur == root||root.next == cur){
            return cur.next = null;
        }
        else{
            temp = root.next;
            root.next = cur;
            cur.next = temp;
        }
        return temp;
    }
}
