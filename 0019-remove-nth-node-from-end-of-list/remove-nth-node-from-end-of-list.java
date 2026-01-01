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
        int count=0;
        ListNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        if (count==1){
            head=null;
            return head;
        }if (count-n==0){
            head=head.next;
            return head;
        }
        temp=head;
        int i=1;
        while (i<count-n){
            i++;
            temp=temp.next;
        }

        temp.next=temp.next.next;
        return head;
    }
}
