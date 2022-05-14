
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
    public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        while(curr.next != null) {
             
            if(curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
            
        }
            return head;
    }
}