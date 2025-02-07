

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
       
    }
}
