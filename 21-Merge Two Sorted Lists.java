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

//Floyd's Cycle Finding Algorithm
//round 1
// 1-2-3-> goes back to 1
// s-f
//check if f is null or f.next is null, then there must be no cycle because if there is then f would go back to another node.
//round 2
//1-2-3
//f-s
// there's a cycle that f went into then we keep going
//round 3
//1-2-3
//0-0-s/f 
//they meet at certain node so there's a cycle and we break

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode head = new ListNode(0);
       ListNode handler = head;
       while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                handler.next = list1;
                list1 = list1.next;
            }else {
                handler.next = list2;
                list2 = list2.next;
            }
            handler = handler.next;
       }
        if(list1 != null) {
            handler.next = list1;
        }else if (list2 != null) {
            handler.next = list2;
        }
        return head.next;
    }
}