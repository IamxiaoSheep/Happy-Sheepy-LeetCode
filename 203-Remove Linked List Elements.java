class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
       ListNode dummy = new ListNode(0); 
       ListNode curr = dummy;
       while(head != null) {
            if(head.val != val) {
                curr.next = head;
                curr = curr.next;
                head = head.next;
            } else {
                    head = head.next;
            }
      
           
       }
        curr.next = null;
        return dummy.next;
    }
}