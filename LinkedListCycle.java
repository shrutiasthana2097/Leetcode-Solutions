//https://leetcode.com/problems/linked-list-cycle/
//Given head, the head of a linked list, determine if the linked list has a cycle in it.

public class Solution {
    public boolean hasCycle(ListNode head) {


        if(head==null)
        {
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(slow!=fast)
        {
            if(fast==null || fast.next==null)
            {
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}
