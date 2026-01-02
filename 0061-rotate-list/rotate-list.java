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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null){
            return head;
        }
        ListNode temp=head;
        int count=1;
        while (temp.next!=null){
            temp= temp.next;
            count++;
        }
        temp.next=head;
        k=count-(k%count);
        while (k>0){
            temp= temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
