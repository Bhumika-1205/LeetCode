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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        ListNode temp=head,first=head;
        while (temp!=null){
            if (count==k-1){
                first=temp;
            }
            temp=temp.next;
            count++;
        }
        int i=0;
        ListNode sec = head;
        while (i<count-k){
            sec= sec.next;
            i++;
        }
        int c= first.val;
        first.val=sec.val;
        sec.val=c;
        return head;
    }
}
