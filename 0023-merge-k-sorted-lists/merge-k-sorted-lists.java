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
        if(lists.length==0) return null;
        return divide(lists,0,lists.length-1);
    }

    private ListNode divide(ListNode[] lists,int l,int r){
        if(l>r) return null;
        if(l==r) return lists[l];

        int mid=l+(r-l)/2;
        ListNode left=divide(lists,l,mid);
        ListNode right=divide(lists,mid+1,r);

        return conquer(left,right);
    }

    private ListNode conquer(ListNode left,ListNode right){
        ListNode head=new ListNode(0);
        ListNode temp=head;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }
            else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }else{
            temp.next=right;
        }
        return head.next;
    }

}
