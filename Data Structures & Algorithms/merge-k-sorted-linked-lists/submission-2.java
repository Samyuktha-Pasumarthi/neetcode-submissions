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
        if(lists.length == 0||lists == null){
            return null;
        }
        return divide(lists,0,lists.length-1);

    }

    public ListNode divide(ListNode[] lists,int l, int r){
        if(l>r){
            return null;
        }
        if(l==r){
            return lists[l];
        }
        int mid = l + (r-l)/2;
        ListNode left = divide(lists,l,mid);
        ListNode right = divide(lists,mid+1,r);

        return merge(left,right);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }
            else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }
        else{
            cur.next = l1;
        }
        return res.next;
    }
}
