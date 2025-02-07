
public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode afterK = head;
        int count = 1;
        while (count != k) {
            if (afterK == null) {
                break;
            }
            count++;
            afterK = afterK.next;
            
        }
        if (afterK == null) {
            return head;
        }
        afterK.next = reverseKGroup(afterK.next, k);
        head = reverseLL(head, afterK.next);
        return head;
    }

    public ListNode reverseLL(ListNode head, ListNode end) {
        ListNode temp = head;
        ListNode prev = end;

        while (temp != end) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

}
