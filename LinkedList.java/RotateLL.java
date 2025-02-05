
public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode temp = head;

        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        temp.next = first;
        k = k % count;
        int tracker = 1;
        temp = head;
        while (tracker != (count - k)) {
            temp = temp.next;
            tracker++;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
