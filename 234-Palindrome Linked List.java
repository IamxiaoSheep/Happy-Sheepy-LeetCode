// Find middle
// Reverse stating from middle
//Start comparing

class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode middle = findMiddle(head);
      ListNode reverse = reverseMiddle(middle.next);
        while(head != null && reverse != null) { 
            if(head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
        
        
        
    }
    
    private ListNode findMiddle(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next != null && fast.next.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
        
    }
    
    private ListNode reverseMiddle(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
        
        
    }
}