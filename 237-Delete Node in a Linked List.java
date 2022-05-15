//dogshit problem has to do something with references

class Solution {
    public void deleteNode(ListNode node) {
       ListNode next = node.next.next;
        node.val = node.next.val;
        node.next = next;
    }
}