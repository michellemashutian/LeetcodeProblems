/**
 *Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *If there are two middle nodes, return the second middle node.
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
class Solution {
    public int getlength(ListNode input)
    {
        int count=0;
        while(input.next!=null)
        {
            input=input.next;
            count++;
        }
        return count+1;
    }
    public ListNode middleNode(ListNode head) {
        int count=getlength(head);
        for(int i=0;i<count/2;i++)
        {
            head=head.next;
        }
        return head;        
    }
}
