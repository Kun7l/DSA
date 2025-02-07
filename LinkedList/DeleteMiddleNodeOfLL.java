public class DeleteMiddleNodeOfLL {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        while (fast.next != null && fast.next.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next.next == null) {
            slow = slow.next;
        }
        
        if (slow.next != null) {
            prev.next = slow.next;
        }
        else {
            prev.next = null;
        }
        return head;
    }
}
