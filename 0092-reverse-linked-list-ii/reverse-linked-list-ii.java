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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        ListNode dummy=null;
        for(int i=1;i<left;i++){
            dummy=temp;
            temp=temp.next;
        }
        ListNode prev=dummy;
        ListNode curr=temp;
        for(int i=left;i<=right;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        temp.next=curr;
        if(dummy!=null) dummy.next=prev;

        head=(left==1)?prev:head;
        return head;
    }
}
