/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// not need for the flody's algorithm because we do need to find a cycle. and here we need to find an intersection.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        
        while(currA != currB) {
            currA = currA == null ? headB : currA.next;
            currB = currB == null ? headA : currB.next; 
        }
        return currA;
        
    }
}