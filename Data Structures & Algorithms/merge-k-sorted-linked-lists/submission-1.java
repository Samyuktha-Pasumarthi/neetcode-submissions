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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        for(int i = 1;i<lists.length;i++){
            lists[i] = merge(lists[i-1],lists[i]);
        }
        return lists[lists.length -1];

    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1!=null && l2!=null){
            if(l1.val >= l2.val){
                cur.next = l2;
                l2 = l2.next;
            }
            else{
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;

        }
        if( l1 == null){
            cur.next = l2;
        }
        else{
            cur.next = l1;
        }
        return res.next;
    }

}
