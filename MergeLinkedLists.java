//https://leetcode.com/problems/merge-two-sorted-lists/
//Merge the two lists in a one sorted list. Return the head of the merged linked list.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head= new ListNode(-1);
        ListNode current =head;
        
        
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                current.next=list1;
                list1=list1.next;
            }
            else
            {
                current.next=list2;
                list2=list2.next;
            }

            current=current.next;
        }

         current.next = list1 == null ? list2 : list1;
        return head.next;
    }
}
