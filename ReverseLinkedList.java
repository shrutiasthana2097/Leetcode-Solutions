//https://leetcode.com/problems/reverse-linked-list/
//Given the head of a singly linked list, reverse the list, and return the reversed list.

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prevNode=null; 
        while(head!=null)
        {
            ListNode n=head;
            head=head.next;
            n.next=prevNode;
            prevNode=n;
        }
        return prevNode;
        
    }
}
